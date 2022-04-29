package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.MangaCharactersModel

data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI
)

fun MangaCharactersModel.toUI() = MangaCharactersUI(links.toUI())
