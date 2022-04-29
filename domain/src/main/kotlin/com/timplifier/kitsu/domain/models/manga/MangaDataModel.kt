package com.timplifier.kitsu.domain.models.manga

data class MangaDataModel(
    val id: String,
    val type: String,
    val links: com.timplifier.kitsu.domain.models.manga.LinksModel,
    val mangaDto: com.timplifier.kitsu.domain.models.manga.MangaModel,
    val relationships: com.timplifier.kitsu.domain.models.manga.RelationshipsModel
)
