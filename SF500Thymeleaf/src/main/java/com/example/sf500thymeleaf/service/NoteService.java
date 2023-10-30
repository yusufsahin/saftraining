package com.example.sf500thymeleaf.service;

import com.example.sf500thymeleaf.dao.model.Note;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    void saveNote(Note note);
    void updateNote(Note note);
    void deleteNoteById(Long id);
}
