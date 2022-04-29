package com.timplifier.kitsu.domain.models.anime

data class DimensionsModel(
    val tiny: com.timplifier.kitsu.domain.models.anime.TinyModel,
    val small: com.timplifier.kitsu.domain.models.anime.SmallModel,
    val medium: com.timplifier.kitsu.domain.models.anime.MediumModel,
    val large: com.timplifier.kitsu.domain.models.anime.LargeModel
)