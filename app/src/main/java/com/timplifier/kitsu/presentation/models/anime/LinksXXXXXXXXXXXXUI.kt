package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXUI(self, related)
