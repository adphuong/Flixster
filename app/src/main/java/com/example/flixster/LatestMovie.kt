package com.example.flixster

import com.google.gson.annotations.SerializedName
/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class LatestMovie {
    @JvmField
    @SerializedName("title")
    var movieTitle: String? = null

    @SerializedName("poster_path")
    val movieImageUrl: String? = null

    @SerializedName("overview")
    val overview: String? = null

}