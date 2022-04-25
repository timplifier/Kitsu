package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.kitsu.domain.models.anime.ReviewsModel

data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
