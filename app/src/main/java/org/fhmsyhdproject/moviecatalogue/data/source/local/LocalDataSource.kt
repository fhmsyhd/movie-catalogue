package org.fhmsyhdproject.moviecatalogue.data.source.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.data.source.local.room.MovieDao

class LocalDataSource private constructor(private val mMovieDao: MovieDao) {

    companion object{
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(movieDao: MovieDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(movieDao)
    }

    fun insertMovies(movies: List<MovieEntity>) = mMovieDao.insertMovies(movies)

    fun getAllMovies(): DataSource.Factory<Int, MovieEntity> = mMovieDao.getMovies()

    fun getAllTvShows(): DataSource.Factory<Int, MovieEntity> = mMovieDao.getTvShows()

    fun getDetailMovie(movieId: String): LiveData<MovieEntity> = mMovieDao.getDetailMovie(movieId)

    fun getDetailTvShows(movieId: String): LiveData<MovieEntity> = mMovieDao.getDetailTvShow(movieId)

    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity> = mMovieDao.getFavoriteMovies()

    fun getFavoriteTvShows(): DataSource.Factory<Int, MovieEntity> = mMovieDao.getFavoriteTvShows()

    fun setFavorite(movie: MovieEntity, newState: Boolean) {
        movie.favorite = newState
        mMovieDao.setFavorite(movie)
    }

}