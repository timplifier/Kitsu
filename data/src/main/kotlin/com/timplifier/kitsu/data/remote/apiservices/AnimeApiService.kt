package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.anime.AnimeListDto
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeListDto
}