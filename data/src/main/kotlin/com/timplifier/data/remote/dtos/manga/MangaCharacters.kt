package com.timplifier.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.manga.MangaCharactersModel

data class MangaCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXX
)

fun MangaCharacters.toDomain() = MangaCharactersModel(links.toDomain())