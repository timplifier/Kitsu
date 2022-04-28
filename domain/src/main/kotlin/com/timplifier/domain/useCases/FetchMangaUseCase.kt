package com.timplifier.domain.useCases

import com.timplifier.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {
    operator fun invoke() = mangaRepository.fetchManga()

}