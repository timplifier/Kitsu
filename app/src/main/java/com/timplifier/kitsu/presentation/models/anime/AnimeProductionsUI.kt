package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.AnimeProductionsModel

data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI
)

fun AnimeProductionsModel.toUI() = AnimeProductionsUI(links.toUI())
