package com.timplifier.domain.models.manga

import com.timplifier.kitsu.domain.models.manga.MediumModel
import com.timplifier.kitsu.domain.models.manga.SmallModel
import com.timplifier.kitsu.domain.models.manga.TinyModel

data class DimensionsModel(

    val tiny: TinyModel,
    val small: SmallModel,
    val medium: MediumModel,
    val large: LargeModel
)
