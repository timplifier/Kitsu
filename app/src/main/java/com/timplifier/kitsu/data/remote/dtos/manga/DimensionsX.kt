package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: TinyX,
    @SerializedName("small")
    val small: SmallX,
    @SerializedName("large")
    val large: LargeX
)