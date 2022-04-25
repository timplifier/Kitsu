package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())
