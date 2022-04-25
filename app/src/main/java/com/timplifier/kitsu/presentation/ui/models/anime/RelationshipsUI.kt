package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.*

data class RelationshipsUI(
    val genres: GenresUI,
    val categories: CategoriesUI,
    val castings: CastingsUI,
    val installments: InstallmentsUI,
    val mappings: MappingsUI,
    val reviews: ReviewsModel,
    val mediaRelationships: MediaRelationshipsModel,
    val episodes: EpisodesModel,
    val streamingLinks: StreamingLinksModel,
    val animeProductions: AnimeProductionsModel,
    val animeCharacters: AnimeCharactersModel,
    val animeStaff: AnimeStaffModel
)
