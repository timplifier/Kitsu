package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun com.timplifier.kitsu.domain.models.anime.MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())
