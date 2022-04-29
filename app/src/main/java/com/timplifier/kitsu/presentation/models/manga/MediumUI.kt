package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MediumModel

data class MediumUI(
    val width: Any,
    val height: Any
)

fun MediumModel.toUI() = MediumUI(width, height)
