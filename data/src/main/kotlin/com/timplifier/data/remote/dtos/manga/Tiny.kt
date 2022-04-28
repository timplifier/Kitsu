package com.timplifier.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.manga.TinyModel

data class Tiny(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any

)

fun Tiny.toDomain() = TinyModel(width, height)