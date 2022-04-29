package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun com.timplifier.kitsu.domain.models.anime.CastingsModel.toUI() = CastingsUI(links.toUI())
