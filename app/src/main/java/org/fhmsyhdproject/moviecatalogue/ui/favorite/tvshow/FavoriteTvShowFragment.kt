package org.fhmsyhdproject.moviecatalogue.ui.favorite.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import org.fhmsyhdproject.moviecatalogue.R
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.databinding.FragmentFavoriteTvShowBinding
import org.fhmsyhdproject.moviecatalogue.ui.MovieFragmentCallback
import org.fhmsyhdproject.moviecatalogue.ui.favorite.FavoriteMovieAdapter
import org.fhmsyhdproject.moviecatalogue.viewmodel.ViewModelFactory

class FavoriteTvShowFragment : Fragment(), MovieFragmentCallback {

    private var _binding: FragmentFavoriteTvShowBinding? = null
    private val binding get() = _binding

    private lateinit var viewModel: FavoriteTvShowViewModel
    private lateinit var adapter: FavoriteMovieAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFavoriteTvShowBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        itemTouchHelper.attachToRecyclerView(binding?.rvFavoriteTvshow)

        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            viewModel = ViewModelProvider(this, factory)[FavoriteTvShowViewModel::class.java]

            adapter = FavoriteMovieAdapter(this)
            binding?.progressBar?.visibility = View.VISIBLE
            viewModel.getFavoriteTvShows().observe(this, { movies ->
                binding?.progressBar?.visibility = View.GONE
                adapter.submitList(movies)
                binding?.tvStatus?.visibility = if (movies.isNotEmpty()) View.GONE else View.VISIBLE
            })

            binding?.rvFavoriteTvshow?.layoutManager = LinearLayoutManager(context)
            binding?.rvFavoriteTvshow?.setHasFixedSize(true)
            binding?.rvFavoriteTvshow?.adapter = adapter
        }

    }

    override fun onShareClick(movieEntity: MovieEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                    .from(requireActivity())
                    .setType(mimeType)
                    .setChooserTitle("Bagikan aplikasi ini sekarang.")
                    .setText(resources.getString(R.string.share_text, movieEntity.title))
                    .startChooser()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback() {
        override fun getMovementFlags(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder
        ): Int =
            makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT)

        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean = true

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            if (view != null) {
                val swipedPosition = viewHolder.adapterPosition
                val movieEntity = adapter.getSwipedData(swipedPosition)

                movieEntity?.let { viewModel.setFavorite(it) }

                val snackbar = Snackbar.make(view as View, R.string.message_undo, Snackbar.LENGTH_LONG)
                snackbar.setAction(R.string.message_ok) { _ ->
                    movieEntity?.let { viewModel.setFavorite(it) }
                }
                snackbar.show()
            }
        }

    })
}