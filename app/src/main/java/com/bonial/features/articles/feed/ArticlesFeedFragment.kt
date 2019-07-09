package com.bonial.features.articles.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bonial.features.articles.feed.adapter.ArticlesFeedAdapter
import com.bonial.infra.view.EndlessRecyclerViewScrollListener
import kotlinx.android.synthetic.main.fragment_articles.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.bonial.R
import com.bonial.infra.ActivityHelper

class ArticlesFeedFragment : Fragment() {

    private val viewModel: ArticlesFeedViewModel by viewModel()
    private var adapter: ArticlesFeedAdapter? = null
    private var scrollListener = EndlessRecyclerViewScrollListener()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_articles, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureRecyclerview()

        viewModel.liveData.observe(this) {
            when(it){
                is Command.HideLoading -> hideLoading()
                is Command.ShowLoading -> showLoading()
                is Command.ShowErrorView -> showErrorView()
                is Command.ShowArticles -> adapter?.submitList(it.articles)
            }
        }

        if (savedInstanceState == null) {
            viewModel.fetchArticles()
        }
    }

    private fun configureRecyclerview() {
        configureAdapter()
        val layoutManager = configureLayoutManager()
        scrollListener.apply {
            mLayoutManager = layoutManager
            onLoadMore = { page, _, _ ->
                viewModel.fetchArticles(page)
            }
            recycler_view.addOnScrollListener(this)
        }
    }

    private fun configureLayoutManager(): GridLayoutManager {
        val layoutManager = GridLayoutManager(context, getSpanCount())
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (adapter?.getViewType(position)) {
                    ArticlesFeedAdapter.VIEW_TYPE.HEADLINE -> getSpanCount()
                    else -> 1
                }
            }
        }

        recycler_view.layoutManager = layoutManager
        return layoutManager
    }

    private fun configureAdapter() {
        adapter = ArticlesFeedAdapter().apply {
            onClickListener = { article ->
                findNavController().navigate(ArticlesFeedFragmentDirections.openDetail(article))
            }
        }
        recycler_view.adapter = adapter
    }

    private fun getSpanCount(): Int {
        return if (ActivityHelper.isPortrait(activity)) 2 else 3
    }

    private fun showLoading(){
        progress_bar.visibility = View.VISIBLE
        recycler_view.visibility = View.GONE
        error_view.visibility = View.GONE
    }

    private fun hideLoading(){
        recycler_view.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE
        error_view.visibility = View.GONE
    }

    private fun showErrorView(){
        error_view.visibility = View.VISIBLE
        progress_bar.visibility = View.GONE
        recycler_view.visibility = View.GONE

        error_view.tryAgainListener = {
            viewModel.fetchArticles()
        }
    }
}