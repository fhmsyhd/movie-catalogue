package org.fhmsyhdproject.moviecatalogue.ui.favorite

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.fhmsyhdproject.moviecatalogue.R
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.databinding.ItemsMovieBinding
import org.fhmsyhdproject.moviecatalogue.ui.MovieFragmentCallback
import org.fhmsyhdproject.moviecatalogue.ui.detail.DetailMovieActivity

class FavoriteMovieAdapter(private val callback: MovieFragmentCallback) : PagedListAdapter<MovieEntity, FavoriteMovieAdapter.FavoriteMovieViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieEntity>() {
            override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem.movieId == newItem.movieId
            }

            override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    inner class FavoriteMovieViewHolder(private val binding: ItemsMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                tvJudulFilm.text = movie.title
                tvGenreFilm.text = movie.genre
                tvDurasiFilm.text = movie.duration

                Glide.with(itemView.context)
                    .load(movie.image)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imgPoster)

                itemView.setOnClickListener {
                    if (movie.type == "movie") {
                        val intent = Intent(itemView.context, DetailMovieActivity::class.java).apply {
                            putExtra(DetailMovieActivity.EXTRA_MOVIE, movie.movieId)
                        }
                        itemView.context.startActivity(intent)
                    } else {
                        val intent = Intent(itemView.context, DetailMovieActivity::class.java).apply {
                            putExtra(DetailMovieActivity.EXTRA_TVSHOW, movie.movieId)
                        }
                        itemView.context.startActivity(intent)
                    }
                }

                imgShare.setOnClickListener { callback.onShareClick(movie) }
            }
        }
    }

    fun getSwipedData(swipedPosition: Int): MovieEntity? = getItem(swipedPosition)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteMovieViewHolder {
        val itemsMovieBinding = ItemsMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FavoriteMovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: FavoriteMovieViewHolder, position: Int) {
        val movie = getItem(position)
        if (movie != null) {
            holder.bind(movie)
        }
    }

}