package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MetaXModel

data class MetaXUI(
    val dimensionsXUI: DimensionsXUI
)

fun com.timplifier.kitsu.domain.models.manga.MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
