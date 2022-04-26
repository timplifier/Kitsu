package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.base.BaseDiffModel
import com.timplifier.kitsu.domain.models.anime.AnimeDataModel

data class AnimeDataUI(
    override val id: String,
    val type: String,
    val links: LinksUI,
    val animeDto: AnimeUI,
    val relationships: RelationshipsUI
) : BaseDiffModel<String>

fun AnimeDataModel.toUI() =
    AnimeDataUI(id, type, links.toUI(), animeDto.toUI(), relationships.toUI())