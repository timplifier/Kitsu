package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
