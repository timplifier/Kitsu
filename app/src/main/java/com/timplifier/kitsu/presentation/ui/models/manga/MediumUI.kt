package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.MediumModel

data class MediumUI(
    val width: Any,
    val height: Any
)

fun MediumModel.toUI() = MediumUI(width, height)
