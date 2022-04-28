package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.data.remote.dtos.anime.Meta
import com.timplifier.data.remote.dtos.anime.toDomain
import com.timplifier.domain.models.anime.PosterImageModel

data class PosterImage(
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("meta")
    val meta: Meta
)

fun PosterImage.toDomain() = PosterImageModel(tiny, small, medium, large, original, meta.toDomain())