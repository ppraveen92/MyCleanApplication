package com.android.mycleanapp.interactors

import com.example.mycleanapp.data.BookmarkRepository
import com.example.mycleanapp.domain.Bookmark
import com.example.mycleanapp.domain.Document

class RemoveBookmark(private val bookmarksRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
        .removeBookmark(document, bookmark)
}