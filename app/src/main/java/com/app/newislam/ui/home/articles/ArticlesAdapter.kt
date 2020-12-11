package com.app.newislam.ui.home.articles

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemNewsBinding
import com.app.newislam.model.requests.home.Articles
import java.util.*


class ArticlesAdapter (val listener: OnArticleClicked):
    ListAdapter<Articles, ArticlesAdapter.ArticlesViewHolder>(ArticlesDiffCallback()), Filterable {

    var mFilteredList: List<Articles>? = null
    var mArticlesList: List<Articles>? = null

    class ArticlesViewHolder(val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Articles) {
            binding.article = article
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ArticlesViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemNewsBinding.inflate(layoutInflater, parent, false)

                return ArticlesViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ArticlesViewHolder {
        return ArticlesViewHolder.from(viewGroup)
    }

    override fun onBindViewHolder(viewHolder: ArticlesViewHolder, position: Int) {
        viewHolder.bind(getItem(position))
        viewHolder.binding.adapter = this

    }


    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {

                val charString = charSequence.toString()

                if (charString.isEmpty()) {
                    mFilteredList = mArticlesList
                } else {
                    mArticlesList?.let {
                        val filteredList = arrayListOf<Articles>()
                        for (baseDataItem in mArticlesList!!) {
                            if (baseDataItem.title.toLowerCase(Locale.ROOT).contains(charString.toLowerCase(
                                    Locale.ROOT))
                            ) {
                                filteredList.add(baseDataItem)
                            }
                        }

                        mFilteredList = filteredList
                    }
                }
                val filterResults = FilterResults()
                filterResults.values = mFilteredList
                return filterResults
            }

            override fun publishResults(
                charSequence: CharSequence,
                filterResults: FilterResults
            ) {
                mFilteredList = filterResults.values as List<Articles>?
                submitList(mFilteredList)
                notifyDataSetChanged()
            }
        }
    }

    class ArticlesDiffCallback : DiffUtil.ItemCallback<Articles>() {
        override fun areItemsTheSame(oldItem: Articles, newItem: Articles): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Articles, newItem: Articles): Boolean {
            return oldItem == newItem
        }

    }

    fun articleClicked(article: Articles) {
        listener.onArticleClicked(article)
    }

    interface OnArticleClicked{
        fun onArticleClicked(article: Articles)
    }
}