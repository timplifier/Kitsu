package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName

data class LinksXDto(
    @SerializedName("first")
    val first: String?,
    @SerializedName("last")
    val last: String?
)