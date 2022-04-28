package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Any,
    val height: Any
)

fun SmallXModel.toUI() = SmallXUI(width, height)