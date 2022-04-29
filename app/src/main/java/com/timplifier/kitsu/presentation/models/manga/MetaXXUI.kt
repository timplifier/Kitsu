package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun com.timplifier.kitsu.domain.models.manga.MetaXXModel.toUI() = MetaXXUI(count)
