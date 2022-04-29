package com.timplifier.kitsu.domain.models.manga

data class DimensionsModel(

    val tiny: com.timplifier.kitsu.domain.models.manga.TinyModel,
    val small: com.timplifier.kitsu.domain.models.manga.SmallModel,
    val medium: com.timplifier.kitsu.domain.models.manga.MediumModel,
    val large: com.timplifier.kitsu.domain.models.manga.LargeModel
)
