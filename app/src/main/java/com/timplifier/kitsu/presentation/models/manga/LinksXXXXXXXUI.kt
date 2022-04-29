package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
