package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.SmallModel

data class SmallUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.anime.SmallModel.toUI() = SmallUI(width, height)
