package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(
    self
)