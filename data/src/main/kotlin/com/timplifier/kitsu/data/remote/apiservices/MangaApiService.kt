package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.manga.MangaListDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaApiService {
    @GET("manga")
    suspend fun fetchManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): MangaListDto


}