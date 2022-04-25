package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
