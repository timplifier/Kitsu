package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.genres.LinksXModel

data class LinksXDto(
    @SerializedName("first")
    val first: String?,
    @SerializedName("last")
    val last: String?
)

fun LinksXDto.toDomain() = LinksXModel(first, last)