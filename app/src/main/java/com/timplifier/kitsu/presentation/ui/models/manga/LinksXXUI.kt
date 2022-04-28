package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)
