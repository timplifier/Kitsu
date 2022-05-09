package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("tiny")
    val tiny: Tiny?,
    @SerializedName("large")
    val large: Large?,
    @SerializedName("small")
    val small: Small?,
    @SerializedName("medium")
    val medium: Medium?
)