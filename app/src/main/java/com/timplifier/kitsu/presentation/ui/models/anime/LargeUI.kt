package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.LargeModel

data class LargeUI(
    val width: Any,
    val height: Any
)

fun LargeModel.toUI() = LargeUI(width, height)
