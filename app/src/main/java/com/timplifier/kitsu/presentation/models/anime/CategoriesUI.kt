package com.timplifier.kitsu.presentation.models.anime

import com.timplifier.kitsu.domain.models.anime.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun com.timplifier.kitsu.domain.models.anime.CategoriesModel.toUI() = CategoriesUI(links.toUI())