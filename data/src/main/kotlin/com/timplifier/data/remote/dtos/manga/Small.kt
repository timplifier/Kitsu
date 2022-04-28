package com.timplifier.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.manga.SmallModel

data class Small(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Small.toDomain() = SmallModel(width, height)