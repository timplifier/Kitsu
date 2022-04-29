package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.LinksXXXXXXModel

data class LinksXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
