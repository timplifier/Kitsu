package com.timplifier.kitsu.domain.useCases

import com.timplifier.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeGenresUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeGenres(id)
}