package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.MangaCharactersModel

data class MangaCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXX
)

fun MangaCharacters.toDomain() =
    com.timplifier.kitsu.domain.models.manga.MangaCharactersModel(links.toDomain())