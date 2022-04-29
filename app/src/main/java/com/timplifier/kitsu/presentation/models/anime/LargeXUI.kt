package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Any,
    val height: Any
)

fun LargeXModel.toUI() = LargeXUI(width, height)
