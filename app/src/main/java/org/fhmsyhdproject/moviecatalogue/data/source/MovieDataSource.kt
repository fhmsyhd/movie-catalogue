package org.fhmsyhdproject.moviecatalogue.data.source

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.vo.Resource

interface MovieDataSource {

    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getAllTvShow(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getDetailMovie(id: String): LiveData<Resource<MovieEntity>>

    fun getDetailTvShow(id: String): LiveData<Resource<MovieEntity>>

    fun getFavoriteMovies(): LiveData<PagedList<MovieEntity>>

    fun getFavoriteTvShows(): LiveData<PagedList<MovieEntity>>

    fun setFavoriteMovie(movie: MovieEntity, state: Boolean)
}