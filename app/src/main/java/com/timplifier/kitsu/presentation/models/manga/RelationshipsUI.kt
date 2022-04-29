package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.RelationshipsModel

data class RelationshipsUI(
    val genres: GenresUI,
    val categories: CategoriesUI,
    val castings: CastingsUI,
    val installments: InstallmentsUI,
    val mappings: MappingsUI,
    val reviews: ReviewsUI,
    val mediaRelationships: MediaRelationshipsUI,
    val chapters: ChaptersUI,
    val mangaCharacters: MangaCharactersUI,
    val mangaStaff: MangaStaffUI
)

fun RelationshipsModel.toUI() =
    RelationshipsUI(
        genres.toUI(),
        categories.toUI(),
        castings.toUI(),
        installments.toUI(),
        mappings.toUI(),
        reviews.toUI(),
        mediaRelationships.toUI(),
        chapters.toUI(), mangaCharacters.toUI(), mangaStaff.toUI()
    )
