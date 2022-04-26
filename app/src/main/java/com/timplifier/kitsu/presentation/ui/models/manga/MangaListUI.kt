package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.domain.models.manga.MangaListModel

data class MangaListUI(
    val data: List<MangaDataUI>,
    val meta: MetaXXUI,
    val links: LinksXXXXXXXXXXXUI
)

fun MangaListModel.toUI() = MangaListUI(data.map { it.toUI() }, meta.toUI(), links.toUI())
