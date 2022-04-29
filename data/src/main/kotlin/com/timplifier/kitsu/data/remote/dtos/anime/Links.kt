package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.LinksModel

data class Links(
    @SerializedName("self")
    val self: String
)

fun Links.toDomain() = com.timplifier.kitsu.domain.models.anime.LinksModel(self)