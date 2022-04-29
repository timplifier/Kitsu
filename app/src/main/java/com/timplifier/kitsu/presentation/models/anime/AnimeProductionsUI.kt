package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.AnimeProductionsModel

data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI
)

fun com.timplifier.kitsu.domain.models.anime.AnimeProductionsModel.toUI() = AnimeProductionsUI(links.toUI())
