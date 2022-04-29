package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.PosterImageModel

data class PosterImageUI(
    val tiny: String,
    val small: String,
    val medium: String,

    val large: String,
    val original: String,
    val meta: MetaUI
)

fun com.timplifier.kitsu.domain.models.anime.PosterImageModel.toUI() = PosterImageUI(tiny, small, medium, large, original, meta.toUI())
