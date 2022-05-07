package com.timplifier.kitsu.di

import com.timplifier.kitsu.data.remote.NetworkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


    @Singleton
    @Provides
    fun provideAnimeApiService(networkClient: NetworkClient) =
        networkClient.provideAnimeApiService()

    @Singleton
    @Provides
    fun provideMangaApiService(networkClient: NetworkClient) =
        networkClient.provideMangaApiService()
}