package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(links.toUI())
