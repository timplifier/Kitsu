package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun com.timplifier.kitsu.domain.models.anime.MetaXXModel.toUI() = MetaXXUI(count)
