package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.genres.LinksModel

data class LinksDto(
    @SerializedName("self")
    val self: String?
)

fun LinksDto.toDomain() = LinksModel(self)