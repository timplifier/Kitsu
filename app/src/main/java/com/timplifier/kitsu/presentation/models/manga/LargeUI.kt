package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.LargeModel

data class LargeUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.manga.LargeModel.toUI() = LargeUI(width, height)
