package com.timplifier.domain.models.anime

import com.timplifier.kitsu.domain.models.anime.MetaModel

data class PosterImageModel(
    val tiny: String,
    val small: String,
    val medium: String,
    val large: String,
    val original: String,
    val meta: MetaModel
)