package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun com.timplifier.kitsu.domain.models.manga.MappingsModel.toUI() = MappingsUI(links.toUI())