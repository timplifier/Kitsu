package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.TinyXModel

data class TinyXUI(
    val width: Any,
    val height: Any
)

fun TinyXModel.toUI() = TinyXUI(width, height)
