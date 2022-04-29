package com.timplifier.kitsu.domain.models.manga

data class DimensionsXModel(
    val tiny: com.timplifier.kitsu.domain.models.manga.TinyXModel,
    val small: com.timplifier.kitsu.domain.models.manga.SmallXModel,
    val large: com.timplifier.kitsu.domain.models.manga.LargeXModel
)