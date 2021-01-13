package org.fhmsyhdproject.moviecatalogue.data

data class MovieEntity (
    var movieId: String,
    var title: String,
    var synopsis: String,
    var genre: String,
    var duration: String,
    var director: String,
    var rating: String,
    var image: String
    )