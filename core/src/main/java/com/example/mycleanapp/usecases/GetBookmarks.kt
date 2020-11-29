package com.android.mycleanapp.interactors

import com.example.mycleanapp.data.BookmarkRepository
import com.example.mycleanapp.domain.Document

class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}