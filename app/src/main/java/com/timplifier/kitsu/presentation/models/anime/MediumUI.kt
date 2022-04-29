package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.MediumModel

data class MediumUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.anime.MediumModel.toUI() = MediumUI(width, height)
