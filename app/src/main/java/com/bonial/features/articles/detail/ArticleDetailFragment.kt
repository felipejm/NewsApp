package com.bonial.features.articles.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bonial.R
import com.bonial.features.articles.model.Article
import com.bonial.infra.GlideApp
import com.bonial.infra.getRelativeTime
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_article_detail.*
import kotlinx.android.synthetic.main.fragment_article_detail.toolbar
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class ArticleDetailFragment: Fragment(){

    val args by navArgs<ArticleDetailFragmentArgs>()

    private val viewModel: ArticleDetailViewModel by viewModel { parametersOf(args.article) }

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_article_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        viewModel.liveData.observe(this){ configureArticle(it) }
        viewModel.loadArticle()
    }

    private fun configureArticle(article: Article){
        context?.let { context ->
            title.text = article.title
            description.text = article.content
            publishedAt.text = article.publishedAt.getRelativeTime()

            article.source?.let {
                source.text = getString(R.string.source_placeholder, it.name)
            }

            GlideApp.with(context).load(article.urlImage).into(image)
        }
    }
}