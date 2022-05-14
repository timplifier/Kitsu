package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.genres.AnimeGenresModel

data class AnimeGenresDto(
    @SerializedName("data")
    val data: List<GenresDataDto>?,
    @SerializedName("meta")
    val meta: MetaDto?,
    @SerializedName("links")
    val links: LinksXDto?
)

fun AnimeGenresDto.toDomain() = AnimeGenresModel(
    data?.map { it.toDomain() }, meta?.toDomain(), links?.toDomain()
)