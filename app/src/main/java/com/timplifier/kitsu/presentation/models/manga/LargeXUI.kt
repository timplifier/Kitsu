package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LargeXModel

data class LargeXUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.manga.LargeXModel.toUI() = LargeXUI(width, height)