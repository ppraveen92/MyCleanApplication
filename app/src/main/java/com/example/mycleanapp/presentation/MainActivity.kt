package com.example.mycleanapp.presentation

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.mycleanapp.R
import com.example.mycleanapp.presentation.viewmodel.ViewModelFactory
import com.example.mycleanapp.presentation.viewmodel.LibraryViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: LibraryViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        viewModel = ViewModelProviders.of(this, ViewModelFactory).get(LibraryViewModel::class.java)
        viewModel.addDocument(Uri.parse("file path"))
    }
}