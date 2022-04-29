package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.AnimeProductionsModel

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun AnimeProductions.toDomain() = com.timplifier.kitsu.domain.models.anime.AnimeProductionsModel(

    links.toDomain()
)