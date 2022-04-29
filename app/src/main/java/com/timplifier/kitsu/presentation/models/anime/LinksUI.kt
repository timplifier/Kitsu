package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksModel

data class LinksUI(
    val self: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksModel.toUI() = LinksUI(
    self
)
