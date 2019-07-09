package com.bonial.features.articles.feed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bonial.R
import com.bonial.features.articles.model.Article
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.view_news_item.view.*

class ArticlesFeedAdapter
    : ListAdapter<Article, ArticlesFeedAdapter.ViewHolder>(
    Diff()
) {

    enum class VIEW_TYPE {
        HEADLINE, SIMPLE
    }

    var onClickListener: (Article) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_news_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), getViewType(position))
    }

    override fun getItemViewType(position: Int): Int {
        return if (position % 7 == 0) VIEW_TYPE.HEADLINE.ordinal else VIEW_TYPE.SIMPLE.ordinal
    }

    fun getViewType(position: Int) = VIEW_TYPE.values()[getItemViewType(position)]

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(article: Article, viewType: VIEW_TYPE) {

            when (viewType) {
                VIEW_TYPE.HEADLINE -> {
                    itemView.title.textSize = 18f
                    itemView.description.textSize = 14f
                }
                else -> {
                    itemView.title.textSize = 12f
                    itemView.description.textSize = 10f
                }
            }

            itemView.setOnClickListener { onClickListener(article) }
            itemView.title.text = article.title
            itemView.description.text = article.description
            article.source?.let { itemView.source.text = it.name }
            Glide.with(itemView.context).load(article.urlImage).into(itemView.image)
        }
    }

    private class Diff : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }
}