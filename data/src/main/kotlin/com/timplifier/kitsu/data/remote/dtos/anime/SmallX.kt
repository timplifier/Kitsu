package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.SmallXModel

data class SmallX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun SmallX.toDomain() = SmallXModel(width, height)