package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
