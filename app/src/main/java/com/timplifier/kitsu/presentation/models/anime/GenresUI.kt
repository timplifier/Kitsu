package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.GenresModel

data class GenresUI(
    val linksXUI: LinksXUI
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())
