package com.example.mycleanapp.usecases

import com.example.mycleanapp.data.BookmarkRepository
import com.example.mycleanapp.domain.Bookmark
import com.example.mycleanapp.domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.addBookmark(document, bookmark)
}