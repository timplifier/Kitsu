package com.timplifier.kitsu.data.remote.dtos.base

data class BaseResponseDto<T>(
    val first: String?,
    val prev: String?,
    val next: String?,
    val last: String?
)
