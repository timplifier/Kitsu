package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.TinyModel

data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(width, height)
