package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.domain.models.anime.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())
