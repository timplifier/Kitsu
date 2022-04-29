package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.kitsu.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun com.timplifier.kitsu.domain.models.manga.CategoriesModel.toUI() = CategoriesUI(links.toUI())