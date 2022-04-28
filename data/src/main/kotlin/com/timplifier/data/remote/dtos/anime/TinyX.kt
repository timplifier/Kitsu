package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.anime.TinyXModel

data class TinyX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun TinyX.toDomain() = TinyXModel(width, height)