package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXXX.toDomain() = com.timplifier.kitsu.domain.models.anime.LinksXXXXXXXXXXModel(
    self, related
)