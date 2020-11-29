package com.example.mycleanapp.framework.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mycleanapp.framework.db.DocumentEntity

@Database(
    entities = [DocumentEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ReaderDatabase : RoomDatabase() {

    companion object {
        private const val DATABASE_NAME = "reader.db"
        private var instance: ReaderDatabase? = null
        private fun create(context: Context): ReaderDatabase =
            Room.databaseBuilder(context, ReaderDatabase::class.java,
                DATABASE_NAME
            )
                .fallbackToDestructiveMigration()
                .build()

        fun getInstance(context: Context): ReaderDatabase =
            (instance
                ?: create(
                    context
                )).also { instance = it }
    }

    abstract fun documentDao(): DocumentDao

}