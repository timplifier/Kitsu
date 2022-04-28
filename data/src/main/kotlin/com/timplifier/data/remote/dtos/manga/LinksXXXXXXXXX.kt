package com.timplifier.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.manga.LinksXXXXXXXXXModel

data class LinksXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXX.toDomain() = LinksXXXXXXXXXModel(

    self, related
)