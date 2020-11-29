package com.example.mycleanapp.data

import com.example.mycleanapp.domain.Document

class DocumentRepository(
    private val documentDataSource: DocumentDataSource,
    private val openDocumentDataSource: OpenDocumentDataSource
) {
     fun addDocument(document: Document) = documentDataSource.add(document)
     fun getDocuments() = documentDataSource.readAll()
     fun removeDocument(document: Document) = documentDataSource.remove(document)
    fun setOpenDocument(document: Document) = openDocumentDataSource.setOpenDocument(document)
    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()
}