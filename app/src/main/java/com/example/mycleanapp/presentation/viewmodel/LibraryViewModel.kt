package com.example.mycleanapp.presentation.viewmodel
import android.app.Application
import android.net.Uri
import com.example.mycleanapp.domain.Document
import com.example.mycleanapp.presentation.Interactors

class LibraryViewModel(application: Application, interactors: Interactors)
  : BaseViewModel(application, interactors) {



    fun addDocument(uri: Uri) {
    interactors.addDocument(Document(uri.toString(), "", 0, ""))
  }

}
