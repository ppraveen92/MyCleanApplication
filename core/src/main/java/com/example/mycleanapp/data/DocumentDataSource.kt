package com.example.mycleanapp.data

import com.example.mycleanapp.domain.Document

interface DocumentDataSource {
     fun add(document: Document)
     fun readAll(): List<Document>
     fun remove(document: Document)
}