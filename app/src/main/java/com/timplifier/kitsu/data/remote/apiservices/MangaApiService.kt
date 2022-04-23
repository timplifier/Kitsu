package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.common.constants.Constants.GET_MANGA
import com.timplifier.kitsu.data.remote.dtos.manga.MangaList
import retrofit2.http.GET

interface MangaApiService {
    @GET(GET_MANGA)
    suspend fun fetchManga(): MangaList


}