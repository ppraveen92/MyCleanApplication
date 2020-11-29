package com.example.mycleanapp.data

import com.example.mycleanapp.domain.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)
    fun getOpenDocument(): Document
}