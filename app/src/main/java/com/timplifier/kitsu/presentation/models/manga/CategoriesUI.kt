package com.timplifier.kitsu.presentation.models.manga

import com.timplifier.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())