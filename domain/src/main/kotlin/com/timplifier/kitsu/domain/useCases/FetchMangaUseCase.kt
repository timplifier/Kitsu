package com.timplifier.kitsu.domain.useCases

import com.timplifier.kitsu.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke() = mangaRepository.fetchManga()

}