package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("prev")
    val prev: String,
    @SerializedName("next")
    val next: String,
    @SerializedName("last")
    val last: String
)