package org.fhmsyhdproject.moviecatalogue.ui.detail

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import org.fhmsyhdproject.moviecatalogue.R
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.databinding.ActivityDetailMovieBinding
import org.fhmsyhdproject.moviecatalogue.viewmodel.ViewModelFactory
import org.fhmsyhdproject.moviecatalogue.vo.Status

class DetailMovieActivity : AppCompatActivity() {

    private var _activityDetailMovieBinding: ActivityDetailMovieBinding? = null

    private val mainBinding get() = _activityDetailMovieBinding
    private val contentBinding get() = _activityDetailMovieBinding?.detailContent

    private lateinit var viewModel: DetailMovieViewModel
    private var isMovie: Boolean = false

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_TVSHOW = "extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(mainBinding?.root)

        val factory = ViewModelFactory.getInstance(this)
        viewModel = ViewModelProvider(this, factory)[DetailMovieViewModel::class.java]

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            val tvShowId = extras.getString(EXTRA_TVSHOW)

            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                viewModel.movie.observe(this, { movies ->
                    when (movies.status){
                        Status.LOADING -> mainBinding?.progressBar?.visibility = View.VISIBLE
                        Status.SUCCESS -> if (movies.data != null) {
                            mainBinding?.progressBar?.visibility = View.GONE
                            populateMovie(movies.data)
                            isMovie = true
                        }
                        Status.ERROR -> {
                            mainBinding?.progressBar?.visibility = View.GONE
                            Toast.makeText(applicationContext, "Terjadi kesalahan", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }
            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId)
                viewModel.tvShow.observe(this, { movies ->
                    when (movies.status){
                        Status.LOADING -> mainBinding?.progressBar?.visibility = View.VISIBLE
                        Status.SUCCESS -> if (movies.data != null) {
                            mainBinding?.progressBar?.visibility = View.GONE
                            populateMovie(movies.data)
                        }
                        Status.ERROR -> {
                            mainBinding?.progressBar?.visibility = View.GONE
                            Toast.makeText(applicationContext, "Terjadi kesalahan", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }
        }

    }

    private fun populateMovie(movieEntity: MovieEntity){
        contentBinding?.tvJudulFilm?.text = movieEntity.title
        contentBinding?.tvGenreFilm?.text = movieEntity.genre
        contentBinding?.tvDurasiFilm?.text = movieEntity.duration
        contentBinding?.tvSutradaraFilm?.text = movieEntity.director
        contentBinding?.tvUsiaFilm?.text = movieEntity.rating
        contentBinding?.tvSinopsisFilm?.text = movieEntity.synopsis

        contentBinding?.imagePoster?.let {
            Glide.with(this)
                .load(movieEntity.image)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(it)
        }

        var status = movieEntity.favorite
        setStatusFavorite(status)

        mainBinding?.fabFavorite?.setOnClickListener {
            status = !status
            setStatusFavorite(status)
            viewModel.setFavorite()
        }
    }

    private fun setStatusFavorite(status: Boolean) {
        if (status)
            mainBinding?.fabFavorite?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_favorited))
        else
            mainBinding?.fabFavorite?.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_favorite))
    }
}