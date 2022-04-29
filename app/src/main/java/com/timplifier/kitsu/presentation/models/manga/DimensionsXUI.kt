package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun DimensionsXModel.toUI() = DimensionsXUI(tiny.toUI(), small.toUI(), large.toUI())
