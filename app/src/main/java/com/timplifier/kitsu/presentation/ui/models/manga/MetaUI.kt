package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(dimensionsModel.toUI())