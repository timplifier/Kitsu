package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.LinksModel

data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(self)
