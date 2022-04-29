package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
