package org.fhmsyhdproject.moviecatalogue.di

import android.content.Context
import org.fhmsyhdproject.moviecatalogue.data.source.MovieRepository
import org.fhmsyhdproject.moviecatalogue.data.source.local.LocalDataSource
import org.fhmsyhdproject.moviecatalogue.data.source.local.room.MovieDatabase
import org.fhmsyhdproject.moviecatalogue.data.source.remote.RemoteDataSource
import org.fhmsyhdproject.moviecatalogue.utils.AppExecutors
import org.fhmsyhdproject.moviecatalogue.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): MovieRepository {

        val database = MovieDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.movieDao())
        val appExecutors = AppExecutors()

        return MovieRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}