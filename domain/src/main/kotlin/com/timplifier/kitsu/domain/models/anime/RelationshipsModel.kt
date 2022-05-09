package com.timplifier.kitsu.domain.models.anime

data class RelationshipsModel(

    val genres: GenresModel?,
    val categories: CategoriesModel?,
    val castings: CastingsModel?,
    val installments: InstallmentsModel?,
    val mappings: MappingsModel?,
    val reviews: ReviewsModel?,
    val mediaRelationships: MediaRelationshipsModel?,
    val episodes: EpisodesModel?,
    val streamingLinks: StreamingLinksModel?,
    val animeProductions: AnimeProductionsModel?,
    val animeCharacters: AnimeCharactersModel?,
    val animeStaff: AnimeStaffModel?
)
