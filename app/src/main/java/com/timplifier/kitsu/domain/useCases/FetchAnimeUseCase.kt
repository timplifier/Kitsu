package com.timplifier.kitsu.domain.useCases

import com.timplifier.kitsu.domain.repositories.AnimeRepository

class FetchAnimeUseCase(private val animeRepository: AnimeRepository) {
    operator fun invoke() = animeRepository.
}