package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXModel

data class LinksXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksXXModel.toUI() = LinksXXUI(self, related)