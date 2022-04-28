package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.TinyXModel

data class TinyX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun TinyX.toDomain() = TinyXModel(
    width, height
)