package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.CoverImageModel
import com.timplifier.kitsu.domain.models.anime.PosterImageModel

data class AnimeUI(
    val createdAt: String,
    val updatedAt: String,
    val slug: String,
    val synopsis: String,
    val coverImageTopOffset: Int,
    val titles: TitlesUI,
    val canonicalTitle: String,
    val abbreviatedTitles: List<String>,
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
    val posterImage: PosterImageModel,
    val coverImage: CoverImageModel,
    val episodeCount: Int,
    val episodeLength: Int,
    val youtubeVideoId: String,
    val showType: String,
    val nsfw: Boolean
)
