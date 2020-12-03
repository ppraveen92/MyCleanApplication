package com.example.mycleanapp.domain

/*
* Document model
* */
data class Document(
    val url: String,
    val name: String,
    val size: Int,
    val thumbnail: String
)