package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.anime.LinksXXXXXXModel

data class LinksXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXX.toDomain() = LinksXXXXXXModel(
    self, related
)