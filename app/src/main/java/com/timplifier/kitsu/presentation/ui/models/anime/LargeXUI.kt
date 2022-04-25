package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Any,
    val height: Any
)

fun LargeXModel.toUI() = LargeXUI(width, height)
