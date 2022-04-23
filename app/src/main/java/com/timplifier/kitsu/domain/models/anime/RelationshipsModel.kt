package com.timplifier.kitsu.domain.models.anime

import com.timplifier.kitsu.data.remote.dtos.anime.*

data class RelationshipsModel(

    val genres: Genres,
    val categories: Categories,
    val castings: Castings,
    val installments: Installments,
    val mappings: Mappings,
    val reviews: Reviews,
    val mediaRelationships: MediaRelationships,
    val episodes: Episodes,
    val streamingLinks: StreamingLinks,
    val animeProductions: AnimeProductions,
    val animeCharacters: AnimeCharacters,
    val animeStaff: AnimeStaff
)
