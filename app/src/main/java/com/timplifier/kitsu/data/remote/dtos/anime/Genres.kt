package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("links")
    val links: LinksX
)