package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MangaCharactersModel

data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI
)

fun com.timplifier.kitsu.domain.models.manga.MangaCharactersModel.toUI() = MangaCharactersUI(links.toUI())
