package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.RelationshipsModel

data class RelationshipsUI(
    val genres: GenresUI,
    val categories: CategoriesUI,
    val castings: CastingsUI,
    val installments: InstallmentsUI,
    val mappings: MappingsUI,
    val reviews: ReviewsUI,
    val mediaRelationships: MediaRelationshipsUI,
    val episodes: EpisodesUI,
    val streamingLinks: StreamingLinksUI,
    val animeProductions: AnimeProductionsUI,
    val animeCharacters: AnimeCharactersUI,
    val animeStaff: AnimeStaffUI
)

fun RelationshipsModel.toUI() = RelationshipsUI(
    genres.toUI(),
    categories.toUI(),
    castings.toUI(),
    installments.toUI(),
    mappings.toUI(),
    reviews.toUI(),
    mediaRelationships.toUI(),
    episodes.toUI(),
    streamingLinks.toUI(),
    animeProductions.toUI(),
    animeCharacters.toUI(),
    animeStaff.toUI()
)
