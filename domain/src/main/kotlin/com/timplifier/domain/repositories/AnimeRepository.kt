package com.timplifier.domain.repositories

import com.timplifier.domain.either.Either
import com.timplifier.domain.models.anime.AnimeListModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnime(): Flow<Either<String, AnimeListModel>>
}