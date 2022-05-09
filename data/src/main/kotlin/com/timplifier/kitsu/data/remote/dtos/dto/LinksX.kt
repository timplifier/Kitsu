package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)