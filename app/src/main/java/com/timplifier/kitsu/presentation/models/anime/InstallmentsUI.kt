package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun com.timplifier.kitsu.domain.models.anime.InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
