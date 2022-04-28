package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(
    links.toUI()
)
