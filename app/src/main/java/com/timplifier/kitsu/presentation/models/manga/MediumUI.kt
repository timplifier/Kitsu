package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MediumModel

data class MediumUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.manga.MediumModel.toUI() = MediumUI(width, height)
