package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXModel

data class LinksXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)
