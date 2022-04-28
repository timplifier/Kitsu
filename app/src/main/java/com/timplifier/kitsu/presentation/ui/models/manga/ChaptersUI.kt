package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.ChaptersModel

data class ChaptersUI(
    val links: LinksXXXXXXXXUI
)

fun ChaptersModel.toUI() = ChaptersUI(links.toUI())