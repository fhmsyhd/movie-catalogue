package org.fhmsyhdproject.moviecatalogue.data.source.remote.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse (
    var movieId: String,
    var type: String,
    var title: String,
    var synopsis: String,
    var genre: String,
    var duration: String,
    var director: String,
    var rating: String,
    var image: String
):Parcelable