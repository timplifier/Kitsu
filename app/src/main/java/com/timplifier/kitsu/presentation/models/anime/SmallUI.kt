package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.SmallModel

data class SmallUI(
    val width: Any,
    val height: Any
)

fun SmallModel.toUI() = SmallUI(width, height)
