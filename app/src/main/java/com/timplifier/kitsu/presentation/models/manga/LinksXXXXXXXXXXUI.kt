package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)
