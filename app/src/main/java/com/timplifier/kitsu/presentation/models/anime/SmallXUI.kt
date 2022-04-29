package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.SmallXModel

data class SmallXUI(
    val width: Any,
    val height: Any
)

fun SmallXModel.toUI() = SmallXUI(width, height)