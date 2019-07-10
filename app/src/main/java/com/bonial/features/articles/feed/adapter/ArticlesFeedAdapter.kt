package com.bonial.features.articles.feed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bonial.R
import com.bonial.features.articles.model.Article
import com.bonial.infra.GlideApp
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.view_news_item.view.*

class ArticlesFeedAdapter
    : ListAdapter<Article, ArticlesFeedAdapter.ViewHolder>(
    Diff()
) {

    enum class ViewType {
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
        return if (position % 7 == 0) ViewType.HEADLINE.ordinal else ViewType.SIMPLE.ordinal
    }

    fun getViewType(position: Int) = ViewType.values()[getItemViewType(position)]

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(article: Article, viewType: ViewType) {

            when (viewType) {
                ViewType.HEADLINE -> {
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
            GlideApp.with(itemView.context).load(article.urlImage).into(itemView.image)
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