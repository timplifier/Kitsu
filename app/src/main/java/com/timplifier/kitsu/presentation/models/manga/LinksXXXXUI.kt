package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
