package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.TitlesModel

data class TitlesUI(
    val en: String,
    val enJp: String,
    val jaJp: String
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
