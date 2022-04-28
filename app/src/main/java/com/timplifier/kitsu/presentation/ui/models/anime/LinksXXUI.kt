package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)