package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.LinksXXModel

data class LinksXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXX.toDomain() = com.timplifier.kitsu.domain.models.anime.LinksXXModel(
    self, related
)