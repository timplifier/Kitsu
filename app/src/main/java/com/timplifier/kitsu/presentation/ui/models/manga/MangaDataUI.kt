package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.base.BaseDiffModel
import com.timplifier.kitsu.domain.models.manga.LinksModel
import com.timplifier.kitsu.domain.models.manga.MangaDataModel

data class MangaDataUI(
    override val id: String,
    val type: String,
    val links: LinksModel,
    val mangaDto: MangaUI,
    val relationships: RelationshipsUI
) : BaseDiffModel<String>

fun MangaDataModel.toUI() = MangaDataUI(id, type, links, mangaDto.toUI(), relationships.toUI())