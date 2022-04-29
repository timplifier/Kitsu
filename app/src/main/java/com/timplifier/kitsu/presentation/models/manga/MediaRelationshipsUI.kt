package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun com.timplifier.kitsu.domain.models.manga.MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())