package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
