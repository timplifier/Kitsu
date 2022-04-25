package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.MetaXModel

data class MetaXUI(
    val dimensions: DimensionsXUI
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
