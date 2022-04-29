package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXXXXModel

data class LinksXXXXXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
