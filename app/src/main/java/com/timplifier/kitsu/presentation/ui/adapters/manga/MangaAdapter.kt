package com.timplifier.kitsu.presentation.ui.adapters.manga

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kitsu.base.BaseDiffUtil
import com.timplifier.kitsu.common.extensions.loadImageWithGlide
import com.timplifier.kitsu.data.remote.dtos.manga.MangaData
import com.timplifier.kitsu.databinding.ItemMangaBinding

class MangaAdapter
    : ListAdapter<MangaData, MangaAdapter.MangaViewHolder>(BaseDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            ItemMangaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(mangaData: MangaData) {
            val chapterCount = mangaData.mangaDto.chapterCount
            val volumeCount = mangaData.mangaDto.volumeCount
            binding.apply {
                mangaData.mangaDto.averageRating?.let {
                    imAverageRating.isVisible = true
                    tvAverageRating.text = mangaData.mangaDto.averageRating
                }
                imManga.loadImageWithGlide(mangaData.mangaDto.posterImage.original)
                tvEnglishTitle.text = mangaData.mangaDto.titles.en
                tvJapaneseTitle.text = mangaData.mangaDto.titles.jaJp
                tvChapterCount.text = "Chapters: $chapterCount($volumeCount volumes)"
                tvDash.text = ""
                if (mangaData.mangaDto.startDate != null && mangaData.mangaDto.endDate != null) {
                    tvDash.text = "-"
                    tvStartDate.text = mangaData.mangaDto.startDate
                    tvEndDate.text = mangaData.mangaDto.endDate
                }


            }

        }

    }

}

