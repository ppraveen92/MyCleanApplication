package com.example.mycleanapp.framework.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.mycleanapp.framework.db.DocumentEntity

/*
* Data Access Object :  can hold  the data which can transfer b/w view and the source of the data
*
* */
@Dao
interface DocumentDao {
    @Insert(onConflict = REPLACE)
    fun addDocument(document: DocumentEntity)

    @Query("SELECT * FROM document")
    fun getDocuments(): List<DocumentEntity>

    @Delete
    fun removeDocument(document: DocumentEntity)
}
