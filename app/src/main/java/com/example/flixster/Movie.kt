package com.example.flixster

import org.json.JSONArray

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie (
    val movieId: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val backdropPath: String) {

    val posterUrl = "https://image.tmdb.org/t/p/w342/$posterPath"
    val backdropUrl = "https://image.tmdb.org/t/p/w342/$backdropPath"

    companion object {
        fun fromJsonArr(arrayMovieJson: JSONArray): MutableList<Movie> {
            val movies = mutableListOf<Movie>()

            for (i in 0 until arrayMovieJson.length()) {
                val jsonMovie = arrayMovieJson.getJSONObject(i)
                movies.add(
                    Movie(
                        jsonMovie.getInt("id"),
                        jsonMovie.getString("title"),
                        jsonMovie.getString("overview"),
                        jsonMovie.getString("poster_path"),
                        jsonMovie.getString("backdrop_path")
                    )
                )
            }
            return movies
        }

    }
}