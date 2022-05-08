package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.anime.AnimeListDto
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(
        @Query("page") page: Int,
        @Query("[limit]", encoded = true) limit: Int,
        @Query("[offset]", encoded = true) offset: Int
    ): AnimeListDto
}