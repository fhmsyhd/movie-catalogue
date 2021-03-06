package org.fhmsyhdproject.moviecatalogue.data.source.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MovieEntity>)

    @Query("SELECT * FROM movieEntities WHERE type = 'movie'")
    fun getMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM movieEntities WHERE type = 'tv-show'")
    fun getTvShows(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM movieEntities WHERE movieId = :id AND type = 'movie'")
    fun getDetailMovie(id: String): LiveData<MovieEntity>

    @Query("SELECT * FROM movieEntities WHERE movieId = :id AND type = 'tv-show'")
    fun getDetailTvShow(id: String): LiveData<MovieEntity>

    @Query("SELECT * FROM movieEntities WHERE type = 'movie' AND favorite = 1")
    fun getFavoriteMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM movieEntities WHERE type = 'tv-show' AND favorite = 1")
    fun getFavoriteTvShows(): DataSource.Factory<Int, MovieEntity>

    @Update
    fun setFavorite(movie: MovieEntity)
}