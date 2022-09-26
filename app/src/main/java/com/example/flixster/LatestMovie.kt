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
    var title: String? = null

    @SerializedName("movie_image")
    val movieImageUrl: String? = null

    @SerializedName("description")
    val description: String? = null

}