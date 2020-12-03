package com.example.mycleanapp.framework.datasourceimpl

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.mycleanapp.data.DocumentDataSource
import com.example.mycleanapp.domain.Document
import com.example.mycleanapp.framework.database.ReaderDatabase
import com.example.mycleanapp.framework.db.DocumentEntity
import com.example.mycleanapp.framework.utils.FileUtil

/*
*
* DataSourceImpl : Here the datasource would implement and do the operation with data access object which is
* gained from ReaderDatabase
*
* */

class RoomDocumentDataSource(val context: Context) : DocumentDataSource {

    private val documentDao = ReaderDatabase.getInstance(context).documentDao()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun add(document: Document) {
        val details =
            FileUtil.getDocumentDetails(context, document.url)
        documentDao.addDocument(
            DocumentEntity(
                document.url,
                details.name,
                details.size,
                details.thumbnail
            )
        )
    }

    override fun readAll(): List<Document> = documentDao.getDocuments().map {
        Document(
            it.uri,
            it.title,
            it.size,
            it.thumbnailUri
        )
    }

    override fun remove(document: Document) = documentDao.removeDocument(
        DocumentEntity(document.url, document.name, document.size, document.thumbnail)
    )
}
