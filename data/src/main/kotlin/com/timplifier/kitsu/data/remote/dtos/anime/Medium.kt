package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Medium.toDomain() = com.timplifier.kitsu.domain.models.anime.MediumModel(width, height)