package com.android.mycleanapp.interactors

import com.example.mycleanapp.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() = documentRepository.getDocuments()
}
