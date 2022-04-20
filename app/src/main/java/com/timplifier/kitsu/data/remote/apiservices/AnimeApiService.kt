package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.common.constants.Constants.ANIME_GET_REQUEST
import retrofit2.http.GET

interface AnimeApiService {
    @GET(ANIME_GET_REQUEST)
    suspend fun fetchAnime()
}