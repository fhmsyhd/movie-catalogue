package org.fhmsyhdproject.moviecatalogue.ui

import org.fhmsyhdproject.moviecatalogue.data.MovieEntity

interface MovieFragmentCallback {
    fun onShareClick(movieEntity: MovieEntity)
}
