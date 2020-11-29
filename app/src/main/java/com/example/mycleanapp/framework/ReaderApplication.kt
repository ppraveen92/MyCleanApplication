package com.example.mycleanapp.framework

import android.app.Application
import com.android.mycleanapp.interactors.AddDocument
import com.example.mycleanapp.data.DocumentRepository
import com.example.mycleanapp.presentation.Interactors
import com.example.mycleanapp.presentation.viewmodel.ViewModelFactory

class ReaderApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val documentRepository = DocumentRepository(
            RoomDocumentDataSource(this),
            InMemoryOpenDocumentDataSource()
        )

        ViewModelFactory.inject(
            this,
            Interactors(AddDocument(documentRepository))
        )
    }
}