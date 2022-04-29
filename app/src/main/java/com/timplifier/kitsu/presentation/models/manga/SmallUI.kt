package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.SmallModel

data class SmallUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.manga.SmallModel.toUI() = SmallUI(width, height)
