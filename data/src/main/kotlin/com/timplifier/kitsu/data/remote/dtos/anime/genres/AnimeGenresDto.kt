package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName

data class AnimeGenresDto(
    @SerializedName("data")
    val data: List<GenresDataDto>?,
    @SerializedName("meta")
    val meta: MetaDto?,
    @SerializedName("links")
    val links: LinksXDto?
)