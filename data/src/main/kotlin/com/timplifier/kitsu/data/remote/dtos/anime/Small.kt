package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.SmallModel

data class Small(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Small.toDomain() = SmallModel(width, height)