package com.timplifier.kitsu.di

import com.timplifier.kitsu.data.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    private val retrofit = RetrofitClient()

    @Singleton
    @Provides
    fun provideAnimeApiService() = retrofit.provideAnimeApiService()
}