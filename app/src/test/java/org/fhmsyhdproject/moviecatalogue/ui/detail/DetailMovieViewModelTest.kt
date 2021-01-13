package org.fhmsyhdproject.moviecatalogue.ui.detail

import org.fhmsyhdproject.moviecatalogue.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyCourse = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyCourse.movieId

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(movieId)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyCourse.movieId)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyCourse.movieId, movieEntity.movieId)
        assertEquals(dummyCourse.title, movieEntity.title)
        assertEquals(dummyCourse.genre, movieEntity.genre)
    }
}