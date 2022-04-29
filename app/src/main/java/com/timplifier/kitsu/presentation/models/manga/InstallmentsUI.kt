package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun com.timplifier.kitsu.domain.models.manga.InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
