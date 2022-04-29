package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.SmallModel

data class SmallUI(
    val width: Any,
    val height: Any
)

fun SmallModel.toUI() = SmallUI(width, height)
