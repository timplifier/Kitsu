package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("links")
    val links: LinksX?
)