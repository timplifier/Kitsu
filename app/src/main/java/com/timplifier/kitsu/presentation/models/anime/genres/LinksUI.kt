package com.timplifier.kitsu.presentation.models.anime.genres

import com.timplifier.kitsu.domain.models.anime.genres.LinksModel

data class LinksUI(
    val self: String?
)

fun LinksModel.toUI() = LinksUI(self)