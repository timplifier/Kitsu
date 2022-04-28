package com.timplifier.domain.useCases

import com.timplifier.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke() = animeRepository.fetchAnime()
}