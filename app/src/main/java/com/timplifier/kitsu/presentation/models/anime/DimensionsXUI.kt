package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.DimensionsXModel

data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun com.timplifier.kitsu.domain.models.anime.DimensionsXModel.toUI() = DimensionsXUI(tiny.toUI(), small.toUI(), large.toUI())
