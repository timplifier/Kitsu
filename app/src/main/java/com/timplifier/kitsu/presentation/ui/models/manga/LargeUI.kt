package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.domain.models.manga.LargeModel

data class LargeUI(
    val width: Any,
    val height: Any
)

fun LargeModel.toUI() = LargeUI(width, height)
