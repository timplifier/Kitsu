package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.AnimeCharactersModel

data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI
)

fun com.timplifier.kitsu.domain.models.anime.AnimeCharactersModel.toUI() = AnimeCharactersUI(links.toUI())
