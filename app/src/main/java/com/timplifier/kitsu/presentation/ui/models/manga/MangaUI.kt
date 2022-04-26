package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.kitsu.domain.models.manga.MangaModel

data class MangaUI(
    val createdAt: String,
    val updatedAt: String,
    val slug: String,
    val synopsis: String,
    val coverImageTopOffset: Int,
    val titles: TitlesUI,
    val canonicalTitle: String,
    val abbreviatedTitles: Any,
    val averageRating: String,
    val ratingFrequencies: RatingFrequenciesUI,
    val userCount: Int,
    val favoritesCount: Int,
    val startDate: String,
    val endDate: String,
    val popularityRank: Int,
    val ratingRank: Int,
    val ageRating: String,
    val ageRatingGuide: String,
    val subtype: String,
    val status: String,
    val tba: String,
    val posterImage: PosterImageUI,
    val coverImage: CoverImageUI,
    val chapterCount: Any,
    val volumeCount: Int,
    val serialization: String,
    val mangaType: String
)

fun MangaModel.toUI() =
    MangaUI(
        createdAt,
        updatedAt,
        slug,
        synopsis,
        coverImageTopOffset,
        titles.toUI(),
        canonicalTitle,
        abbreviatedTitles,
        averageRating,
        ratingFrequencies.toUI(),
        userCount,
        favoritesCount,
        startDate,
        endDate,
        popularityRank,
        ratingRank,
        ageRating,
        ageRatingGuide,
        subtype,
        status,
        tba,
        posterImage.toUI(),
        coverImage.toUI(),
        chapterCount,
        volumeCount,
        serialization,
        mangaType
    )