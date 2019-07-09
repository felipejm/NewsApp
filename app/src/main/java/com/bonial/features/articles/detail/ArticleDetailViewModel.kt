package com.bonial.features.articles.detail

import androidx.lifecycle.*
import com.bonial.features.articles.model.Article
import com.bonial.features.articles.model.ArticlesUseCase
import kotlinx.coroutines.launch

class ArticleDetailViewModel(private val article: Article): ViewModel(){

    private val _liveData = MutableLiveData<Article>()
    val liveData: LiveData<Article> = _liveData

    fun loadArticle(){
        _liveData.value = article
    }
}