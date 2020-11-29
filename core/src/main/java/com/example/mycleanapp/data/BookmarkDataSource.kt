package com.example.mycleanapp.data

import com.example.mycleanapp.domain.Bookmark
import com.example.mycleanapp.domain.Document

interface BookmarkDataSource {
    suspend fun add(document: Document, bookmark: Bookmark)
    suspend fun read(document: Document): List<Bookmark>
    suspend fun remove(document: Document, bookmark: Bookmark)
}