package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String

)

fun LinksXXXXXXXX.toDomain() = LinksXXXXXXXX(
    self, related
)