package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.anime.AnimeList
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnime(): Flow<Either<String, AnimeList>>
}