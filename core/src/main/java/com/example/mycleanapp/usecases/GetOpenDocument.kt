package com.android.mycleanapp.interactors

import com.example.mycleanapp.data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {
    operator fun invoke() = documentRepository.getOpenDocument()
}
