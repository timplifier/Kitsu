package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.SmallModel

data class SmallUI(
    val width: Int?,
    val height: Int?
)

fun SmallModel.toUI() = SmallUI(width, height)
