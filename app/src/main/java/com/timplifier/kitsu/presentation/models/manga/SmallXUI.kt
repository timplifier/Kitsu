package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.SmallXModel

data class SmallXUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.manga.SmallXModel.toUI() = SmallXUI(width, height)