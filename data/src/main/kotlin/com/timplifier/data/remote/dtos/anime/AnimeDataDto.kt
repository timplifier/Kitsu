package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.data.remote.dtos.anime.Links
import com.timplifier.domain.models.anime.AnimeDataModel

data class AnimeDataDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("attributes")
    val animeDto: AnimeDto,
    @SerializedName("relationships")
    val relationships: Relationships
)

fun AnimeDataDto.toDomain() = AnimeDataModel(
    id, type, links.toDomain(), animeDto.toDomain(), relationships.toDomain()
)