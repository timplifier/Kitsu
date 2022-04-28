package com.timplifier.kitsu.di

import com.timplifier.data.repositories.AnimeRepositoryImpl
import com.timplifier.data.repositories.MangaRepositoryImpl
import com.timplifier.domain.repositories.AnimeRepository
import com.timplifier.domain.repositories.MangaRepository
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
}