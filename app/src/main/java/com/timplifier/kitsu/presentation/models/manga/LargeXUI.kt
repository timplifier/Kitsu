package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.LargeXModel

data class LargeXUI(
    val width: Any,
    val height: Any
)

fun LargeXModel.toUI() = LargeXUI(width, height)