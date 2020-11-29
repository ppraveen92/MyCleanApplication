package com.android.mycleanapp.interactors

import com.example.mycleanapp.data.DocumentRepository
import com.example.mycleanapp.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {
   operator fun invoke(document: Document) = documentRepository.addDocument(document)
}
