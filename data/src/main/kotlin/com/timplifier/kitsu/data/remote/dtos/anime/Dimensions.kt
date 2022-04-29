package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.DimensionsModel

data class Dimensions(
    @SerializedName("tiny")
    val tiny: Tiny,
    @SerializedName("small")
    val small: Small,
    @SerializedName("medium")
    val medium: Medium,
    @SerializedName("large")
    val large: Large
)

fun Dimensions.toDomain() = com.timplifier.kitsu.domain.models.anime.DimensionsModel(
    tiny.toDomain(), small.toDomain(), medium.toDomain(), large.toDomain()
)