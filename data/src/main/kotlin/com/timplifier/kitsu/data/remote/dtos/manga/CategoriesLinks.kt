package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXX.toDomain() = com.timplifier.kitsu.domain.models.manga.LinksXXModel(
    self, related
)