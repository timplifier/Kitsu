package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height:Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)