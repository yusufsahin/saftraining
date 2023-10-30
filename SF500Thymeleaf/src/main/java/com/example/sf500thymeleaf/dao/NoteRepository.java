package com.example.sf500thymeleaf.dao;

import com.example.sf500thymeleaf.dao.model.Note;

import java.util.List;

public interface NoteRepository {
    List<Note> findAll();
    Note findById(Long id);
    void save(Note note);
    void update(Note note);
    void deleteById(Long id);

    void saveAll(List<Note> list);
}
