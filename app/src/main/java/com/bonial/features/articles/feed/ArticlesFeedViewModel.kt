package com.bonial.features.articles.feed

import androidx.lifecycle.*
import com.bonial.features.articles.model.Article
import com.bonial.features.articles.model.ArticlesUseCase
import kotlinx.coroutines.launch
import androidx.paging.PagedList
import kotlinx.coroutines.CoroutineExceptionHandler
import timber.log.Timber

class ArticlesFeedViewModel(private val useCase: ArticlesUseCase): ViewModel(){

    private val _liveData = MutableLiveData<Command>()
    val liveData: LiveData<Command> = _liveData

    private val articles: MutableList<Article> = arrayListOf()

    private val errorHandler = CoroutineExceptionHandler { _, exception ->
        _liveData.value = Command.ShowErrorView
        Timber.e(exception)
    }

    fun fetchArticles(page: Int = 1){
        viewModelScope.launch(errorHandler) {
            _liveData.value = Command.ShowLoading

            val response = useCase.fetchHeadLines(page, PAGE_SIZE)
            if(response.totalResults > 0) {
                articles.addAll(response.articles)
                _liveData.value = Command.ShowArticles(articles)
            }

            _liveData.value = Command.HideLoading
        }
    }

    companion object{
        private const val PAGE_SIZE = 21
    }
}