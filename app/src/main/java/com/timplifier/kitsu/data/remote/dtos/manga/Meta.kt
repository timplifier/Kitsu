package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.MetaModel

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())