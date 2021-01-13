package org.fhmsyhdproject.moviecatalogue.ui.tvshow

import androidx.lifecycle.ViewModel
import org.fhmsyhdproject.moviecatalogue.data.MovieEntity
import org.fhmsyhdproject.moviecatalogue.utils.DataDummy

class TvShowViewModel: ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()
}