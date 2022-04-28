package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.data.remote.dtos.anime.LinksXXXXXXXXXXXXX
import com.timplifier.kitsu.data.remote.dtos.anime.MetaXX
import com.timplifier.domain.models.anime.AnimeListModel

data class AnimeListDto(
    @SerializedName("data")
    val data: List<AnimeDataDto>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXX
)

fun AnimeListDto.toDomain() = AnimeListModel(
    data.map { it.toDomain() }, meta.toDomain(), links.toDomain()
)