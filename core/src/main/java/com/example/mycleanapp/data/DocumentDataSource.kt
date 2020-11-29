package com.example.mycleanapp.data

import com.example.mycleanapp.domain.Document

/*
* DataSource : abstract definitions for accessing data sources. This will be implemented by Framework RoomDocumentDataSource
*
* */
interface DocumentDataSource {
    fun add(document: Document)
    fun readAll(): List<Document>
    fun remove(document: Document)
}