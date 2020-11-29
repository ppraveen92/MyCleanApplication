package com.example.mycleanapp.framework

import com.example.mycleanapp.data.OpenDocumentDataSource
import com.example.mycleanapp.domain.Document

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}
