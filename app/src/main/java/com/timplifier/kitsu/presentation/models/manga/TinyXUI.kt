package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
