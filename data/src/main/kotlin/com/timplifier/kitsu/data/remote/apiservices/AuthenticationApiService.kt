package com.timplifier.kitsu.data.remote.apiservices

import retrofit2.http.POST
import retrofit2.http.Query

interface AuthenticationApiService {
    @POST("token")
    suspend fun authenticate(
        @Query("grant_type") grantType: String,
        @Query("username") email: String,
        @Query("password ") password: String
    )
}