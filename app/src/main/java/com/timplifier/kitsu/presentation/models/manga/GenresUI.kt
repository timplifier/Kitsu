package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI
)

fun com.timplifier.kitsu.domain.models.manga.GenresModel.toUI() = GenresUI(links.toUI())