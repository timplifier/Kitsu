package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXModel.toUI() = LinksXXXUI(self, related)
