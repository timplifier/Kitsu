package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun com.timplifier.kitsu.domain.models.manga.DimensionsXModel.toUI() = DimensionsXUI(tiny.toUI(), small.toUI(), large.toUI())
