package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.AnimeListModel

data class AnimeListDto(
    @SerializedName("data")
    val data: List<AnimeDataDto>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXX
)

fun AnimeListDto.toDomain() = com.timplifier.kitsu.domain.models.anime.AnimeListModel(
    data.map { it.toDomain() }, meta.toDomain(), links.toDomain()
)