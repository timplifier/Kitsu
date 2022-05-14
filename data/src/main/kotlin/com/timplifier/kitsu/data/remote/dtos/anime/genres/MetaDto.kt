package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.genres.MetaModel

data class MetaDto(
    @SerializedName("count")
    val count: Int?
)

fun MetaDto.toDomain() = MetaModel(count)