package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun com.timplifier.kitsu.domain.models.manga.MetaModel.toUI() = MetaUI(dimensionsModel.toUI())