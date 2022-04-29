package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LargeXModel

data class LargeXUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.anime.LargeXModel.toUI() = LargeXUI(width, height)
