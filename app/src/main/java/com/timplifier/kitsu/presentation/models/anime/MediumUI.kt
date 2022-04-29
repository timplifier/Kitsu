package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.MediumModel

data class MediumUI(
    val width: Any,
    val height: Any
)

fun MediumModel.toUI() = MediumUI(width, height)
