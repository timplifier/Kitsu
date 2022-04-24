package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.MediumModel

data class MediumUI(
    val width: Any,
    val height: Any
)

fun MediumModel.toUI() = MediumUI(width, height)
