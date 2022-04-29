package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXModel

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXX.toDomain() = com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXModel(
    self, related
)