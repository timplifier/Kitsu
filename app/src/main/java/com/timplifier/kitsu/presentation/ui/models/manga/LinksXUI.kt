package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
