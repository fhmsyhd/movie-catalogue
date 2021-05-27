package org.fhmsyhdproject.moviecatalogue.utils

import android.content.Context
import org.fhmsyhdproject.moviecatalogue.data.source.remote.response.MovieResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)

        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val type = movie.getString("type")
                val title = movie.getString("title")
                val synopsis = movie.getString("synopsis")
                val genre = movie.getString("genre")
                val duration = movie.getString("duration")
                val director = movie.getString("director")
                val rating = movie.getString("rating")
                val image = movie.getString("image")

                val movieResponse = MovieResponse(id, type, title, synopsis, genre, duration, director, rating, image)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }

    fun loadTvShows(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("tv_shows")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val id = movie.getString("id")
                val type = movie.getString("type")
                val title = movie.getString("title")
                val synopsis = movie.getString("synopsis")
                val genre = movie.getString("genre")
                val duration = movie.getString("duration")
                val director = movie.getString("director")
                val rating = movie.getString("rating")
                val image = movie.getString("image")

                val movieResponse = MovieResponse(id, type, title, synopsis, genre, duration, director, rating, image)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return list
    }

}