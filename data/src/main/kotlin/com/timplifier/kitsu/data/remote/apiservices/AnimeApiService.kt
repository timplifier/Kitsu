package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.anime.AnimeListDto
import com.timplifier.kitsu.data.remote.dtos.anime.SingleAnimeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeListDto

    @GET("anime/{id}")
    suspend fun fetchSingleAnime(@Path("id") id: String): SingleAnimeDto
}