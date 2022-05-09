package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: TinyX?,
    @SerializedName("large")
    val large: LargeX?,
    @SerializedName("small")
    val small: SmallX?
)