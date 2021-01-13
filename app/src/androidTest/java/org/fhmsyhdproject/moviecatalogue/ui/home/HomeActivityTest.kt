package org.fhmsyhdproject.moviecatalogue.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import org.fhmsyhdproject.moviecatalogue.R
import org.fhmsyhdproject.moviecatalogue.utils.DataDummy
import org.junit.Before
import org.junit.Test

class HomeActivityTest {

    private val dataDummy = DataDummy.generateDummyMovies()

    @Before
    fun setup(){
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataDummy.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_judul_film)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_judul_film)).check(matches(withText(dataDummy[0].title)))
        onView(withId(R.id.tv_durasi_film)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_durasi_film)).check(matches(withText(dataDummy[0].duration)))
        onView(withId(R.id.tv_genre_film)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_film)).check(matches(withText(dataDummy[0].genre)))
        onView(withId(R.id.tv_sutradara_film)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_sutradara_film)).check(matches(withText(dataDummy[0].director)))
        onView(withId(R.id.tv_usia_film)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_usia_film)).check(matches(withText(dataDummy[0].rating)))
        onView(withId(R.id.tv_sinopsis_film)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_sinopsis_film)).check(matches(withText(dataDummy[0].synopsis)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataDummy.size))
    }

}