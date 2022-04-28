package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())