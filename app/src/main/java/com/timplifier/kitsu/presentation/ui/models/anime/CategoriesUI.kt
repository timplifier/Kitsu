package com.timplifier.kitsu.presentation.ui.models.anime

import com.timplifier.domain.models.anime.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())