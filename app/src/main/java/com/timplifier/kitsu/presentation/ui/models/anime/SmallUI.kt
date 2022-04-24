package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.SmallModel

data class SmallUI(
    val width: Any,
    val height: Any
)

fun SmallModel.toUI() = SmallUI(width, height)
