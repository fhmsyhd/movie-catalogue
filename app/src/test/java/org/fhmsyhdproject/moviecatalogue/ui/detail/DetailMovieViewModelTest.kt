package org.fhmsyhdproject.moviecatalogue.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.fhmsyhdproject.moviecatalogue.data.source.local.entitiy.MovieEntity
import org.fhmsyhdproject.moviecatalogue.data.source.MovieRepository
import org.fhmsyhdproject.moviecatalogue.utils.DataDummy
import org.fhmsyhdproject.moviecatalogue.vo.Resource
import org.junit.Test

import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShows()

    private val tvShowId = dummyTvShow[0].movieId
    private val movieId = dummyMovie[0].movieId

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var movieObserver: Observer<Resource<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel(movieRepository)
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getMovieDetail() {
        val dummyDetailMovie = Resource.success(DataDummy.generateDummyMovies()[0])
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyDetailMovie

        `when`(movieRepository.getDetailMovie(movieId)).thenReturn(movie)
        viewModel.movie.observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyDetailMovie)
    }

    @Test
    fun getTvShowDetail() {
        val dummyDetailTvShow = Resource.success(DataDummy.generateDummyTvShows()[0])
        val tvShow = MutableLiveData<Resource<MovieEntity>>()
        tvShow.value = dummyDetailTvShow

        `when`(movieRepository.getDetailTvShow(tvShowId)).thenReturn(tvShow)
        viewModel.tvShow.observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyDetailTvShow)
    }

    @Test
    fun setFavoriteMovie(){
        val dummyDetailMovie = Resource.success(DataDummy.moviesData()[0])
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyDetailMovie

        `when`(movieRepository.getDetailMovie(movieId)).thenReturn(movie)
        viewModel.movie = movieRepository.getDetailMovie(movieId)
        viewModel.setFavorite()
        verify(movieRepository).setFavoriteMovie(movie.value?.data as MovieEntity, true)
        verifyNoMoreInteractions(movieObserver)
    }

    @Test
    fun deleteFavoriteMovie() {
        val dummyDetailMovie = Resource.success(DataDummy.moviesData()[0])
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyDetailMovie

        `when`(movieRepository.getDetailMovie(movieId)).thenReturn(movie)
        viewModel.movie = movieRepository.getDetailMovie(movieId)
        viewModel.setFavorite()
        verify(movieRepository).setFavoriteMovie(movie.value?.data as MovieEntity, true)
        verify(movieRepository).setFavoriteMovie(movie.value?.data as MovieEntity, false)
        verifyNoMoreInteractions(movieObserver)
    }
}