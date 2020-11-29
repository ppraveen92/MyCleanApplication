package com.example.mycleanapp.framework

import android.app.Application
import com.android.mycleanapp.interactors.AddDocument
import com.example.mycleanapp.data.DocumentRepository
import com.example.mycleanapp.presentation.Interactors

class MajesticReaderApplication : Application() {

  override fun onCreate() {
    super.onCreate()
      val documentRepository = DocumentRepository(
          RoomDocumentDataSource(this),
          InMemoryOpenDocumentDataSource()
      )
    MajesticViewModelFactory.inject(
        this,
        Interactors(AddDocument(documentRepository))
    )
  }
}