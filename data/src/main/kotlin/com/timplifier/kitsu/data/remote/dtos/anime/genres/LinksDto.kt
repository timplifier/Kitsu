package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("self")
    val self: String?
)