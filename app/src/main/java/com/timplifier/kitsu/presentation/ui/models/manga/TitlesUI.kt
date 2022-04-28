package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.TitlesModel

data class TitlesUI(
    val en: String?,
    val enJp: String,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
