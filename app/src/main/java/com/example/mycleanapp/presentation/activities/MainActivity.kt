package com.example.mycleanapp.presentation.activities

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.mycleanapp.R
import com.example.mycleanapp.framework.factory.ViewModelFactory
import com.example.mycleanapp.presentation.viewmodel.LibraryViewModel
import kotlinx.android.synthetic.main.activity_main3.*

/*
* Activity where user trigger the action
* */
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: LibraryViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory
        ).get(LibraryViewModel::class.java)
        btnadd.setOnClickListener { viewModel.addDocument(Uri.parse("file:///storage/emulated/0/Download/test.pdf")) }
        btnremove.setOnClickListener { viewModel.removeDocument(Uri.parse("file:///storage/emulated/0/Download/test.pdf")) }
    }
}