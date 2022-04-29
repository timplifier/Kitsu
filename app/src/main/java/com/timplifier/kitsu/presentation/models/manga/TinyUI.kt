package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.TinyModel

data class TinyUI(
    val width: Any,
    val height: Any
)

fun TinyModel.toUI() = TinyUI(width, height)