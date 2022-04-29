package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.AnimeStaffModel

data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI
)

fun AnimeStaffModel.toUI() = AnimeStaffUI(links.toUI())
