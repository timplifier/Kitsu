package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXUI(self, related)
