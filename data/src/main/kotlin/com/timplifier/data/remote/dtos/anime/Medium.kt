package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.anime.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Medium.toDomain() = MediumModel(width, height)