package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.LinksXXXXXXXXModel

data class LinksXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)
