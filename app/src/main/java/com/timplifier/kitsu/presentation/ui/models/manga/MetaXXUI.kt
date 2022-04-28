package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
