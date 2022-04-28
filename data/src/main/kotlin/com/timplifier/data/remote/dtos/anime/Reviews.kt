package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.data.remote.dtos.anime.LinksXXXXXX
import com.timplifier.kitsu.domain.models.anime.ReviewsModel

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())