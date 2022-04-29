package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.CoverImageModel

data class CoverImageUI(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXUI
)

fun com.timplifier.kitsu.domain.models.anime.CoverImageModel.toUI() = CoverImageUI(tiny, small, large, original, meta.toUI())
