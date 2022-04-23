package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class MangaDto(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: Any,
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequencies,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("ratingRank")
    val ratingRank: Int,
    @SerializedName("ageRating")
    val ageRating: String,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String,
    @SerializedName("subtype")
    val subtype: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("tba")
    val tba: String,
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("coverImage")
    val coverImage: CoverImage,
    @SerializedName("chapterCount")
    val chapterCount: Any,
    @SerializedName("volumeCount")
    val volumeCount: Int,
    @SerializedName("serialization")
    val serialization: String,
    @SerializedName("mangaType")
    val mangaType: String
)