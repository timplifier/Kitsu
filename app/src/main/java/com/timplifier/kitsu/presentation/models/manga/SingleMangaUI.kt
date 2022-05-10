package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.SingleMangaModel

data class SingleMangaUI(
    val data: MangaDataUI
)

fun SingleMangaModel.toUI() = SingleMangaUI(data.toUI())
