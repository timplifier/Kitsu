package com.timplifier.kitsu.domain.models.anime

data class RelationshipsModel(

    val genres: com.timplifier.kitsu.domain.models.anime.GenresModel,
    val categories: com.timplifier.kitsu.domain.models.anime.CategoriesModel,
    val castings: com.timplifier.kitsu.domain.models.anime.CastingsModel,
    val installments: com.timplifier.kitsu.domain.models.anime.InstallmentsModel,
    val mappings: com.timplifier.kitsu.domain.models.anime.MappingsModel,
    val reviews: ReviewsModel,
    val mediaRelationships: com.timplifier.kitsu.domain.models.anime.MediaRelationshipsModel,
    val episodes: com.timplifier.kitsu.domain.models.anime.EpisodesModel,
    val streamingLinks: StreamingLinksModel,
    val animeProductions: com.timplifier.kitsu.domain.models.anime.AnimeProductionsModel,
    val animeCharacters: com.timplifier.kitsu.domain.models.anime.AnimeCharactersModel,
    val animeStaff: com.timplifier.kitsu.domain.models.anime.AnimeStaffModel
)
