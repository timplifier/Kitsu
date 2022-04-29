package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())