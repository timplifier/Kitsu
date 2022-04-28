package com.timplifier.kitsu.domain.models.manga

import com.timplifier.domain.models.manga.CoverImageModel

data class MangaModel(
    val createdAt: String,
    val updatedAt: String,
    val slug: String,
    val synopsis: String,
    val coverImageTopOffset: Int,
    val titles: TitlesModel,
    val canonicalTitle: String,
    val abbreviatedTitles: Any,
    val averageRating: String?,
    val ratingFrequencies: RatingFrequenciesModel,
    val userCount: Int,
    val favoritesCount: Int,
    val startDate: String?,
    val endDate: String?,
    val nextRelease: Any?,
    val popularityRank: Int,
    val ratingRank: Int?,
    val ageRating: String?,
    val ageRatingGuide: String?,
    val subtype: String,
    val status: String,
    val tba: String?,
    val posterImage: PosterImageModel,
    val coverImage: CoverImageModel?,
    val chapterCount: Any?,
    val volumeCount: Int,
    val serialization: String?,
    val mangaType: String
)