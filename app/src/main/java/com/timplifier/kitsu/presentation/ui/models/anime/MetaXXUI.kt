package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
