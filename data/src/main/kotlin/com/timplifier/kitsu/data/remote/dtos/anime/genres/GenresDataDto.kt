package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName

data class GenresDataDto(
    @SerializedName("id")
    val id: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("links")
    val links: LinksDto?,
    @SerializedName("attributes")
    val genres: GenreDto?
)