package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.anime.AnimeListModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnime(page: Int): Flow<Either<String, AnimeListModel>>
}