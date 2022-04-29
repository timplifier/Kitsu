package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.TinyModel

data class TinyUI(
    val width: Any,
    val height: Any
)

fun com.timplifier.kitsu.domain.models.anime.TinyModel.toUI() = TinyUI(
    width, height
)