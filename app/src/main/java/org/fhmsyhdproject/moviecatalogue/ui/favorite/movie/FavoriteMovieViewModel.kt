package org.fhmsyhdproject.moviecatalogue.ui.favorite.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import org.fhmsyhdproject.moviecatalogue.data.source.MovieRepository
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity

class FavoriteMovieViewModel(private val movieRepository: MovieRepository): ViewModel() {

    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>> = movieRepository.getFavoriteMovies()

    fun setFavorite(movieEntity: MovieEntity) {
        val newState = !movieEntity.favorite
        movieRepository.setFavoriteMovie(movieEntity, newState)
    }
}