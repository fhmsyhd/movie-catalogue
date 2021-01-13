package org.fhmsyhdproject.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import org.fhmsyhdproject.moviecatalogue.data.MovieEntity
import org.fhmsyhdproject.moviecatalogue.utils.DataDummy

class MovieViewModel: ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()
}