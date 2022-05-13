package com.timplifier.kitsu.di

import com.timplifier.kitsu.data.repositories.AnimeRepositoryImpl
import com.timplifier.kitsu.data.repositories.AuthenticationRepositoryImpl
import com.timplifier.kitsu.data.repositories.MangaRepositoryImpl
import com.timplifier.kitsu.domain.repositories.AnimeRepository
import com.timplifier.kitsu.domain.repositories.AuthenticationRepository
import com.timplifier.kitsu.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {
    @Binds
    abstract fun bindAnimeRepository(
        animeRepositoryImpl: AnimeRepositoryImpl
    ): AnimeRepository

    @Binds
    abstract fun bindMangaRepository(mangaRepositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    abstract fun bindAuthenticationRepository(authenticationRepositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository
}