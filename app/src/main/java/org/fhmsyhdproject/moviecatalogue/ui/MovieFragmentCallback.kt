package org.fhmsyhdproject.moviecatalogue.ui

import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity

interface MovieFragmentCallback {
    fun onShareClick(movieEntity: MovieEntity)
}
