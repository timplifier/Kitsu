package com.timplifier.domain.models.anime

import com.timplifier.kitsu.domain.models.anime.MetaXModel

data class CoverImageModel(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXModel
)