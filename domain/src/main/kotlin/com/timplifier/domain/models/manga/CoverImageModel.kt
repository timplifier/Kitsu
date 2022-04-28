package com.timplifier.domain.models.manga

import com.timplifier.kitsu.domain.models.manga.MetaXModel

data class CoverImageModel(
    val tiny: String,
    val small: String,
    val large: String,
    val original: String,
    val meta: MetaXModel
)
