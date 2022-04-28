package com.timplifier.domain.models.manga

import com.timplifier.domain.models.manga.LargeXModel
import com.timplifier.kitsu.domain.models.manga.SmallXModel
import com.timplifier.kitsu.domain.models.manga.TinyXModel

data class DimensionsXModel(
    val tiny: TinyXModel,
    val small: SmallXModel,
    val large: LargeXModel
)