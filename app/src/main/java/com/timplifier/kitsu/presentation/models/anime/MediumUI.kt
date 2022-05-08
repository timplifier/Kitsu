package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.MediumModel

data class MediumUI(
    val width: Int?,
    val height: Int?
)

fun MediumModel.toUI() = MediumUI(width, height)
