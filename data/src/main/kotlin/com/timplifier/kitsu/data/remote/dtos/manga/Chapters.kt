package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.ChaptersModel

data class Chapters(
    @SerializedName("links")
    val links: LinksXXXXXXXX
)

fun Chapters.toDomain() = com.timplifier.kitsu.domain.models.manga.ChaptersModel(
    links.toDomain()
)