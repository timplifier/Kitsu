package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.LinksXXXXModel

data class LinksXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXModel.toUI() = LinksXXXXUI(self, related)
