package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.domain.models.manga.SmallModel

data class SmallUI(
    val width: Any,
    val height: Any
)

fun SmallModel.toUI() = SmallUI(width, height)
