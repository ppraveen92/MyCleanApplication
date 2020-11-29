package com.example.mycleanapp.presentation

import android.app.Application
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.android.mycleanapp.interactors.AddDocument
import com.example.mycleanapp.R
import com.example.mycleanapp.data.DocumentRepository
import com.example.mycleanapp.framework.InMemoryOpenDocumentDataSource
import com.example.mycleanapp.presentation.viewmodel.ViewModelFactory
import com.example.mycleanapp.framework.RoomDocumentDataSource
import com.example.mycleanapp.presentation.viewmodel.LibraryViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: LibraryViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val documentRepository = DocumentRepository(
            RoomDocumentDataSource(this),
            InMemoryOpenDocumentDataSource()
        )
        ViewModelFactory.inject(
            applicationContext as Application,
            Interactors(AddDocument(documentRepository))
        )

        viewModel = ViewModelProviders.of(this, ViewModelFactory).get(LibraryViewModel::class.java)
        viewModel.addDocument(Uri.parse(""))

    }
}