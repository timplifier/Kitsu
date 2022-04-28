package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.anime.SmallXModel

data class SmallX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun SmallX.toDomain() = SmallXModel(width, height)