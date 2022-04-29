package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.RatingFrequenciesModel

data class RatingFrequenciesUI(
    val x2: String,
    val x3: String,
    val x4: String,
    val x5: String,
    val x6: String,
    val x7: String,
    val x8: String,
    val x9: String,
    val x10: String,
    val x11: String,
    val x12: String,
    val x13: String,
    val x14: String,
    val x15: String,
    val x16: String,
    val x17: String,
    val x18: String,
    val x19: String,
    val x20: String
)

fun RatingFrequenciesModel.toUI() = RatingFrequenciesUI(
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