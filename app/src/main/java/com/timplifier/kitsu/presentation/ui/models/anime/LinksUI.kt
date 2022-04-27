package com.timplifier.kitsu.presentation.ui.models.anime

data class LinksUI(
    val self: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksModel.toUI() = LinksUI(
    self
)
