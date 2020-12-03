package com.example.mycleanapp.framework.database

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.example.mycleanapp.framework.db.DocumentEntity
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@SmallTest
class DocumentDaoTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var database: ReaderDatabase
    private lateinit var dao: DocumentDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            ReaderDatabase::class.java
        ).allowMainThreadQueries().build()
        dao = database.documentDao()
    }

    @After
    fun endUp() {
        database.close()
    }

    @Test
    fun addBook() {
        val document = DocumentEntity("test", "sports", 23, "test.png")
        dao.addDocument(document)
        val alldocs = dao.getDocuments()
        assertThat(alldocs).contains(document)
    }

    @Test
    fun removeBook() {
        val document = DocumentEntity("test", "sports", 23, "test.png")
        dao.removeDocument(document)
        val alldocs = dao.getDocuments()
        assertThat(alldocs).doesNotContain(document)
    }

    @Test
    fun addRemoveBook() {
        val document = DocumentEntity("test", "sports", 23, "test.png")
        dao.addDocument(document)
        dao.removeDocument(document)
        val alldocs = dao.getDocuments()
        assertThat(alldocs).doesNotContain(document)
    }
}