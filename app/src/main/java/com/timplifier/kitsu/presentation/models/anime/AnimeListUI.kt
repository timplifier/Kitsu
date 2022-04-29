package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.AnimeListModel

data class AnimeListUI(
    val data: List<AnimeDataUI>,
    val meta: MetaXXUI,
    val links: LinksXXXXXXXXXXXXXUI
)

fun AnimeListModel.toUI() = AnimeListUI(data.map { it.toUI() }, meta.toUI(), links.toUI())
