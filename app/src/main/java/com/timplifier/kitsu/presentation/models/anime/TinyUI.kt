package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.TinyModel

data class TinyUI(
    val width: Any,
    val height: Any
)

fun TinyModel.toUI() = TinyUI(
    width, height
)