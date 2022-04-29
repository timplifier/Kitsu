package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.LargeModel

data class LargeUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.anime.LargeModel.toUI() = LargeUI(width, height)
