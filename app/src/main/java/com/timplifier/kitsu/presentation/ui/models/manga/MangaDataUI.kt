package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.base.BaseDiffModel
import com.timplifier.kitsu.domain.models.manga.MangaDataModel

data class MangaDataUI(
    override val id: String,
    val type: String,
    val links: LinksUI,
    val mangaDto: MangaUI,
    val relationships: RelationshipsUI
) : BaseDiffModel

fun MangaDataModel.toUI() =
    MangaDataUI(id, type, links.toUI(), mangaDto.toUI(), relationships.toUI())