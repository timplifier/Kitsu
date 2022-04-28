package com.timplifier.domain.models.anime

import com.timplifier.kitsu.domain.models.anime.RelationshipsModel


data class AnimeDataModel(
    val id: String,
    val type: String,
    val links: LinksModel,
    val animeDto: AnimeModel,
    val relationships: RelationshipsModel
)
