package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.TinyXModel

data class TinyXUI(
    val width: Any,
    val height: Any
)

fun TinyXModel.toUI() = TinyXUI(width, height)
