package com.timplifier.kitsu.presentation.ui.models.manga

import com.timplifier.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())