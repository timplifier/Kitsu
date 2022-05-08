package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.TinyXModel

data class TinyXUI(
    val width: Int?,
    val height: Int?
)

fun TinyXModel.toUI() = TinyXUI(width, height)
