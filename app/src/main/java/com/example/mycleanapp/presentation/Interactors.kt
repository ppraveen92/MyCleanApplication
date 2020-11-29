package com.example.mycleanapp.presentation

import com.android.mycleanapp.interactors.*
import com.example.mycleanapp.usecases.AddBookmark

data class Interactors(
   /* val addBookmark: AddBookmark,
    val getBookmarks: GetBookmarks,
    val deleteBookmark: RemoveBookmark,*/
    val addDocument: AddDocument
   /* val getDocuments: GetDocuments,
    val removeDocument: RemoveDocument,
    val getOpenDocument: GetOpenDocument,
    val setOpenDocument: SetOpenDocument*/
)