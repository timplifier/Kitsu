package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun com.timplifier.kitsu.domain.models.manga.CastingsModel.toUI() = CastingsUI(
    links.toUI()
)
