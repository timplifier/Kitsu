package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI
)

fun GenresModel.toUI() = GenresUI(links.toUI())