package com.timplifier.kitsu.presentation.ui.adapters.anime

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kitsu.base.BaseDiffUtil
import com.timplifier.kitsu.common.extensions.loadImageWithGlide
import com.timplifier.kitsu.data.remote.dtos.anime.Data
import com.timplifier.kitsu.databinding.ItemAnimeBinding


class AnimeAdapter(
    private val onItemClick: (id: String) -> Unit
) : ListAdapter<Data, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: Data) {
            val amountOfEpisodes = data.animeDto.episodeCount
            binding.apply {
                root.setOnClickListener {

                    tvAverageRating.text = data.animeDto.averageRating
                    imAnime.loadImageWithGlide(data.animeDto.posterImage.original)
                    tvEnglishTitle.text = data.animeDto.titles.en
                    tvJapaneseTitle.text = data.animeDto.titles.jaJp
                    tvAmountOfEpisodes.text = "Episodes : $amountOfEpisodes TV"
                    imStatus.setImageResource()
                    tvStartDate.text = data.animeDto.startDate
                    tvEndDate.text = data.animeDto.endDate

                    onItemClick(data.id)
                }
            }

        }

    }

}

