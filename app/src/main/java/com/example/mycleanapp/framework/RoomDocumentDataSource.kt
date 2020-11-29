package com.example.mycleanapp.framework

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.mycleanapp.data.DocumentDataSource
import com.example.mycleanapp.domain.Document
import com.example.mycleanapp.framework.db.DocumentEntity

class RoomDocumentDataSource(val context: Context) : DocumentDataSource {

    private val documentDao = MajesticReaderDatabase.getInstance(context).documentDao()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override suspend fun add(document: Document) {
        val details = FileUtil.getDocumentDetails(context, document.url)
        documentDao.addDocument(
            DocumentEntity(document.url, details.name, details.size, details.thumbnail)
        )
    }

    override suspend fun readAll(): List<Document> = documentDao.getDocuments().map {
        Document(
            it.uri,
            it.title,
            it.size,
            it.thumbnailUri
        )
    }

    override suspend fun remove(document: Document) = documentDao.removeDocument(
        DocumentEntity(document.url, document.name, document.size, document.thumbnail)
    )
}
