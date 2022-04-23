package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.base.BaseDiffModel
import com.timplifier.kitsu.domain.models.anime.AnimeDataModel

data class AnimeDataDto(
    @SerializedName("id")
    override val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("attributes")
    val animeDto: AnimeDto,
    @SerializedName("relationships")
    val relationships: Relationships
) : BaseDiffModel<String>

fun AnimeDataDto.toDomain() = AnimeDataModel(
    id, type, links.toDomain(), animeDto.to, relationships.toDomain()
)