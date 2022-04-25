package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.*

data class RelationshipsUI(
    val genres: GenresUI,
    val categories: CategoriesUI,
    val castings: CastingsUI,
    val installments: InstallmentsUI,
    val mappings: MappingsUI,
    val reviews: ReviewsUI,
    val mediaRelationships: MediaRelationshipsUI,
    val episodes:  EpisodesUI,
    val streamingLinks: StreamingLinksModel,
    val animeProductions: AnimeProductionsModel,
    val animeCharacters: AnimeCharactersModel,
    val animeStaff: AnimeStaffModel
)
