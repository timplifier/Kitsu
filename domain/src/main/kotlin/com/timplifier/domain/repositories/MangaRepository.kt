package com.timplifier.domain.repositories

import com.timplifier.domain.either.Either
import com.timplifier.kitsu.domain.models.manga.MangaListModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchManga(): Flow<Either<String, MangaListModel>>
}