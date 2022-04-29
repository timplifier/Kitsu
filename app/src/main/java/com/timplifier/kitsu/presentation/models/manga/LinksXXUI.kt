package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.manga.LinksXXModel.toUI() = LinksXXUI(self, related)
