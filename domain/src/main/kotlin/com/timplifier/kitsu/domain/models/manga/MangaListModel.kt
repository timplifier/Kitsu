package com.timplifier.kitsu.domain.models.manga

data class MangaListModel(
    val data: List<com.timplifier.kitsu.domain.models.manga.MangaDataModel>,
    val meta: com.timplifier.kitsu.domain.models.manga.MetaXXModel,
    val links: com.timplifier.kitsu.domain.models.manga.LinksXXXXXXXXXXXModel
)