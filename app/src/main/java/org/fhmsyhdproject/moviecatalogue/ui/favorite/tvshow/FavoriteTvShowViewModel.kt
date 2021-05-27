package org.fhmsyhdproject.moviecatalogue.ui.favorite.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import org.fhmsyhdproject.moviecatalogue.data.source.MovieRepository
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity

class FavoriteTvShowViewModel(private val movieRepository: MovieRepository): ViewModel() {

    fun getFavoriteTvShows(): LiveData<PagedList<MovieEntity>> = movieRepository.getFavoriteTvShows()

    fun setFavorite(movieEntity: MovieEntity) {
        val newState = !movieEntity.favorite
        movieRepository.setFavoriteMovie(movieEntity, newState)
    }

}