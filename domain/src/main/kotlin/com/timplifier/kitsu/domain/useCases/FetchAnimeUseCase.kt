package com.timplifier.kitsu.domain.useCases

import com.timplifier.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(page : Int) = animeRepository.fetchAnime(page)
}