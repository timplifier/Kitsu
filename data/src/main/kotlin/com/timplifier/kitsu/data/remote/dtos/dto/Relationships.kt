package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("genres")
    val genres: Genres?,
    @SerializedName("categories")
    val categories: Categories?,
    @SerializedName("castings")
    val castings: Castings?,
    @SerializedName("installments")
    val installments: Installments?,
    @SerializedName("mappings")
    val mappings: Mappings?,
    @SerializedName("reviews")
    val reviews: Reviews?,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships?,
    @SerializedName("characters")
    val characters: Characters?,
    @SerializedName("staff")
    val staff: Staff?,
    @SerializedName("productions")
    val productions: Productions?,
    @SerializedName("quotes")
    val quotes: Quotes?,
    @SerializedName("episodes")
    val episodes: Episodes?,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinks?,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductions?,
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharacters?,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaff?
)