package com.example.notesappmvvm.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notesappmvvm.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDataBase:RoomDatabase() {
    abstract val noteDao:NoteDao

    companion object {
        val DATABASE_NAME: String?
            get() {
                TODO()
            }
    }

}