package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXUI(
    val first: String,
    val prev: String?,
    val next: String,
    val last: String
)

fun com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXXUI(first, prev, next, last)
