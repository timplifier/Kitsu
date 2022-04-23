package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("castings")
    val castings: Castings,
    @SerializedName("installments")
    val installments: Installments,
    @SerializedName("mappings")
    val mappings: Mappings,
    @SerializedName("reviews")
    val reviews: Reviews,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationships,
    @SerializedName("chapters")
    val chapters: Chapters,
    @SerializedName("mangaCharacters")
    val mangaCharacters: MangaCharacters,
    @SerializedName("mangaStaff")
    val mangaStaff: MangaStaff
)