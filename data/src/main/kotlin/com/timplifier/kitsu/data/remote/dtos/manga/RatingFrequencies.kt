package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.RatingFrequenciesModel

data class RatingFrequencies(
    @SerializedName("2")
    val x2: String,
    @SerializedName("3")
    val x3: String,
    @SerializedName("4")
    val x4: String,
    @SerializedName("5")
    val x5: String,
    @SerializedName("6")
    val x6: String,
    @SerializedName("7")
    val x7: String,
    @SerializedName("8")
    val x8: String,
    @SerializedName("9")
    val x9: String,
    @SerializedName("10")
    val x10: String,
    @SerializedName("11")
    val x11: String,
    @SerializedName("12")
    val x12: String,
    @SerializedName("13")
    val x13: String,
    @SerializedName("14")
    val x14: String,
    @SerializedName("15")
    val x15: String,
    @SerializedName("16")
    val x16: String,
    @SerializedName("17")
    val x17: String,
    @SerializedName("18")
    val x18: String,
    @SerializedName("19")
    val x19: String,
    @SerializedName("20")
    val x20: String
)

fun RatingFrequencies.toDomain() = RatingFrequenciesModel(
    x2,
    x3,
    x4,
    x5,
    x6,
    x7,
    x8,
    x9,
    x10,
    x11,
    x12,
    x13,
    x14,
    x15,
    x16,
    x17,
    x18,
    x19,
    x20
)