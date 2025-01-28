package com.example.notesappmvvm.feature_note.presentation.notes.components

import com.example.notesappmvvm.feature_note.domain.util.NoteOrder
import com.example.notesappmvvm.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<com.example.notesappmvvm.feature_note.domain.model.Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
