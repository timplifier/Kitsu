package com.timplifier.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.manga.MangaListModel

data class MangaListDto(
    @SerializedName("data")
    val data: List<MangaData>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX
)

fun MangaListDto.toDomain() =
    MangaListModel(data.map { it.toDomain() }, meta.toDomain(), links.toDomain())