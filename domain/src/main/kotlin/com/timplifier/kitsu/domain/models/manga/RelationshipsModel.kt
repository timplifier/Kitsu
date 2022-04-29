package com.timplifier.kitsu.domain.models.manga

data class RelationshipsModel(
    val genres: com.timplifier.kitsu.domain.models.manga.GenresModel,
    val categories: com.timplifier.kitsu.domain.models.manga.CategoriesModel,
    val castings: com.timplifier.kitsu.domain.models.manga.CastingsModel,
    val installments: com.timplifier.kitsu.domain.models.manga.InstallmentsModel,
    val mappings: com.timplifier.kitsu.domain.models.manga.MappingsModel,
    val reviews: com.timplifier.kitsu.domain.models.manga.ReviewsModel,
    val mediaRelationships: com.timplifier.kitsu.domain.models.manga.MediaRelationshipsModel,
    val chapters: com.timplifier.kitsu.domain.models.manga.ChaptersModel,
    val mangaCharacters: com.timplifier.kitsu.domain.models.manga.MangaCharactersModel,
    val mangaStaff: com.timplifier.kitsu.domain.models.manga.MangaStaffModel
)
