package com.timplifier.kitsu.domain.useCases

import com.timplifier.kitsu.domain.repositories.MangaRepository

class FetchMangaUseCase(private val mangaRepository: MangaRepository) {
    operator fun invoke() = mangaRepository.fetchManga()
}