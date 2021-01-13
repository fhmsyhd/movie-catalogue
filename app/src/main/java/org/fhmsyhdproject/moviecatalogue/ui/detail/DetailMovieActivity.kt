package org.fhmsyhdproject.moviecatalogue.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import org.fhmsyhdproject.moviecatalogue.R
import org.fhmsyhdproject.moviecatalogue.data.MovieEntity
import org.fhmsyhdproject.moviecatalogue.databinding.ActivityDetailMovieBinding
import org.fhmsyhdproject.moviecatalogue.databinding.ContentDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var detailContentMovieBinding: ContentDetailMovieBinding

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailMovieBinding = ActivityDetailMovieBinding.inflate(layoutInflater)
        detailContentMovieBinding = activityDetailMovieBinding.detailContent

        setContentView(activityDetailMovieBinding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_MOVIE)
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                populateMovie(viewModel.getMovie())
            }
        }

    }

    private fun populateMovie(movieEntity: MovieEntity){
        detailContentMovieBinding.tvJudulFilm.text = movieEntity.title
        detailContentMovieBinding.tvGenreFilm.text = movieEntity.genre
        detailContentMovieBinding.tvDurasiFilm.text = movieEntity.duration
        detailContentMovieBinding.tvSutradaraFilm.text = movieEntity.director
        detailContentMovieBinding.tvUsiaFilm.text = movieEntity.rating
        detailContentMovieBinding.tvSinopsisFilm.text = movieEntity.synopsis

        Glide.with(this)
                .load(movieEntity.image)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(detailContentMovieBinding.imagePoster)
    }
}