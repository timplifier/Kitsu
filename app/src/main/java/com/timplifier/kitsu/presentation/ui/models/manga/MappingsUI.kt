package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())