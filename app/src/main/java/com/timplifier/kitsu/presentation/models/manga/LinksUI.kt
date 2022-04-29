package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksModel

data class LinksUI(
    val self: String
)

fun com.timplifier.kitsu.domain.models.manga.LinksModel.toUI() = LinksUI(self)
