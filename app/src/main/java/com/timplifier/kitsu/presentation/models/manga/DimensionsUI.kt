package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.DimensionsModel

data class DimensionsUI(
    val tiny: TinyUI,
    val small: SmallUI,
    val medium: MediumUI,
    val large: LargeUI
)

fun com.timplifier.kitsu.domain.models.manga.DimensionsModel.toUI() = DimensionsUI(tiny.toUI(), small.toUI(), medium.toUI(), large.toUI())