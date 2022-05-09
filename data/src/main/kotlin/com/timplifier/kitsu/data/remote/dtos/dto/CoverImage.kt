package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class CoverImage(
    @SerializedName("tiny")
    val tiny: String?,
    @SerializedName("large")
    val large: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("original")
    val original: String?,
    @SerializedName("meta")
    val meta: MetaX?
)