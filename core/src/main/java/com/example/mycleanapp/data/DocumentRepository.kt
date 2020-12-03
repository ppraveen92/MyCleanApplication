package com.example.mycleanapp.data

import com.example.mycleanapp.domain.Document

/*
* Repository : Provides methods for accessing the data that transfer to DataSource
*
* */
class DocumentRepository(private val documentDataSource: DocumentDataSource) {
    fun addDocument(document: Document) = documentDataSource.add(document)
    fun removeDocument(document: Document) = documentDataSource.remove(document)
    fun getDocuments() = documentDataSource.readAll()
}