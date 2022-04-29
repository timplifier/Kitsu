package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.AnimeCharactersModel

data class AnimeCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX
)

fun AnimeCharacters.toDomain() = com.timplifier.kitsu.domain.models.anime.AnimeCharactersModel(
    links.toDomain()
)