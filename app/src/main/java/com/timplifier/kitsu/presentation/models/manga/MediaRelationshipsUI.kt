package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())