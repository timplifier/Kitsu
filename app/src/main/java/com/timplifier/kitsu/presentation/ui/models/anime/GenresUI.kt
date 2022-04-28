package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.GenresModel

data class GenresUI(
    val linksXUI: LinksXUI
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())
