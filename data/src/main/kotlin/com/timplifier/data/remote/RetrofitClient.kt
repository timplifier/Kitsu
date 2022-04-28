package com.timplifier.data.remote

import com.timplifier.data.remote.apiservices.AnimeApiService
import com.timplifier.data.remote.apiservices.MangaApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(provideLoggingInterceptor())
        .connectTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .build()

    private fun provideLoggingInterceptor() =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    fun provideAnimeApiService(): AnimeApiService = retrofit.create(AnimeApiService::class.java)
    fun provideMangaApiService(): MangaApiService = retrofit.create(MangaApiService::class.java)

    companion object {
        const val BASE_URL = "https://kitsu.io/api/edge/"
    }
}
