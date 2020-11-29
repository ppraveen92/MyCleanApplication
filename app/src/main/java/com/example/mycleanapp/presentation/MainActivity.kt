package com.example.mycleanapp.presentation

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.mycleanapp.interactors.AddDocument
import com.example.mycleanapp.R
import com.example.mycleanapp.data.DocumentRepository
import com.example.mycleanapp.framework.InMemoryOpenDocumentDataSource
import com.example.mycleanapp.framework.MajesticViewModelFactory
import com.example.mycleanapp.framework.RoomDocumentDataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val documentRepository = DocumentRepository(
            RoomDocumentDataSource(this),
            InMemoryOpenDocumentDataSource()
        )
        MajesticViewModelFactory.inject(
            applicationContext as Application,
            Interactors(AddDocument(documentRepository))
        )


    }
}