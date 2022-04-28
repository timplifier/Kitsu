package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.DimensionsModel

data class DimensionsUI(

    val tiny: TinyUI,
    val small: SmallUI,
    val medium: MediumUI,
    val large: LargeUI
)

fun DimensionsModel.toUI() = DimensionsUI(
    tiny.toUI(), small.toUI(), medium.toUI(), large.toUI()
)