package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.anime.LargeXModel

data class LargeX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun LargeX.toDomain() = LargeXModel(width, height)