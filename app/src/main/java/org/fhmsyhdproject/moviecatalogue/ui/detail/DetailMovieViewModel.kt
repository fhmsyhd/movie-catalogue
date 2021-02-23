package org.fhmsyhdproject.moviecatalogue.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.data.source.MovieRepository
import org.fhmsyhdproject.moviecatalogue.vo.Resource

class DetailMovieViewModel(private val movieRepository: MovieRepository): ViewModel() {
    private var movieId = MutableLiveData<String>()
    private var thShowId= MutableLiveData<String>()

    fun setSelectedMovie(movieId: String){
        this.movieId.value = movieId
    }

    fun setSelectedTvShow(tvShowId: String){
        this.thShowId.value = tvShowId
    }

    var movie: LiveData<Resource<MovieEntity>> =Transformations.switchMap(movieId) { movieId ->
        movieRepository.getDetailMovie(movieId)
    }

    var tvShow: LiveData<Resource<MovieEntity>> =Transformations.switchMap(thShowId) { tvShowId ->
        movieRepository.getDetailTvShow(tvShowId)
    }

    fun setFavorite() {
        val resourceMovie = movie.value
        val resourceTvShow = tvShow.value

        if (resourceMovie != null) {
            val movieData = resourceMovie.data

            if (movieData != null) {
                val newState = !movieData.favorite
                movieRepository.setFavoriteMovie(movieData, newState)
            }
        }

        if (resourceTvShow != null) {
            val tvShowData = resourceTvShow.data

            if (tvShowData != null) {
                val newState = !tvShowData.favorite
                movieRepository.setFavoriteMovie(tvShowData, newState)
            }
        }
    }
}