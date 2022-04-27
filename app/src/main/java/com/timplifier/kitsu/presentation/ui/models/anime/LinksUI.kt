package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(
    self
)
