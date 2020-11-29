package com.example.mycleanapp.presentation.lib
import android.app.Application
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import com.example.mycleanapp.domain.Document
import com.example.mycleanapp.framework.MajesticViewModel
import com.example.mycleanapp.presentation.Interactors

class LibraryViewModel(application: Application, interactors: Interactors)
  : MajesticViewModel(application, interactors) {

  val documents: MutableLiveData<List<Document>> = MutableLiveData()

  fun loadDocuments() {
    // TODO start loading documents
  }

  suspend fun addDocument(uri: Uri) {

    interactors.addDocument(Document(uri.toString(), "", 0, ""))

  }


  fun setOpenDocument(document: Document) {
    // TODO set currently open document
  }
}
