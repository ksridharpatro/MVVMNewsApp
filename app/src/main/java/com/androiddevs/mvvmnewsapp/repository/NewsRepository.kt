package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(pageNumber = pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}

