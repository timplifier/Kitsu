package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun com.timplifier.kitsu.domain.models.anime.MappingsModel.toUI() = MappingsUI(links.toUI())