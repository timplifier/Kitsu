package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.LinksXXModel

data class LinksXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)
fun LinksXX.toDomain() = LinksXXModel(
    self,related
)