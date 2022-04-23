package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("tiny")
    val tiny: Tiny,
    @SerializedName("small")
    val small: Small,
    @SerializedName("medium")
    val medium: Medium,
    @SerializedName("large")
    val large: Large
)