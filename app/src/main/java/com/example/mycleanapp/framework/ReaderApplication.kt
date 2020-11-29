package com.example.mycleanapp.framework

import android.app.Application
import com.android.mycleanapp.interactors.AddDocument
import com.example.mycleanapp.data.DocumentRepository
import com.example.mycleanapp.presentation.Interactors
import com.example.mycleanapp.presentation.viewmodel.ViewModelFactory
/*
* Application class where it does the injection with all the usecase which has the repository
*
* */
class ReaderApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val documentRepository = DocumentRepository(
            RoomDocumentDataSource(this)
        )

        ViewModelFactory.inject(
            this,
            Interactors(AddDocument(documentRepository))
        )
    }
}