package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.manga.MangaList
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchManga(): Flow<Either<String, MangaList>>
}