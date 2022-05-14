package com.timplifier.kitsu.domain.models.anime.genres

data class GenresDataModel(
    val id: String?,
    val type: String?,
    val links: LinksModel?,
    val genres: GenreModel?
)
