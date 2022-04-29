package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun com.timplifier.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXXXUI(first, prev, next, last)
