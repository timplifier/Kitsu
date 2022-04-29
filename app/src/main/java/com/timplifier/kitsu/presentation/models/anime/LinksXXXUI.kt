package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXModel

data class LinksXXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksXXXModel.toUI() = LinksXXXUI(self, related)
