package com.timplifier.kitsu.presentation.models.anime.genres

import com.timplifier.kitsu.domain.models.anime.genres.MetaModel

data class MetaUI(
    val count: Int?
)

fun MetaModel.toUI() = MetaUI(count)
