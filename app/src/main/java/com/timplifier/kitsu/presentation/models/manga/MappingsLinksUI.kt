package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)
