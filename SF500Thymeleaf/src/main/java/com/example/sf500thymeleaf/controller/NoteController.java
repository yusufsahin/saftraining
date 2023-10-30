package com.example.sf500thymeleaf.controller;

import com.example.sf500thymeleaf.dao.model.Note;
import com.example.sf500thymeleaf.service.impl.NoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/notes")
public class NoteController {

    @Autowired
    private NoteServiceImpl noteService;

    @GetMapping
    public String listNotes(Model model) {
        List<Note> notes = noteService.getAllNotes();
        model.addAttribute("notes", notes);
        return "notes";
    }

    @GetMapping("/add")
    public String showAddNoteForm(Model model) {
        model.addAttribute("note", new Note());
        return "addOrUpdateNote";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateNoteForm(@PathVariable Long id, Model model) {
        Note existingNote = noteService.getNoteById(id);
        model.addAttribute("note", existingNote);
        return "addOrUpdateNote";
    }

    @PostMapping
    public String addOrUpdateNote(@ModelAttribute("note") Note note) {
        noteService.saveNote(note);
        return "redirect:/notes";
    }

    @GetMapping("/{id}")
    public String getNoteById(@PathVariable Long id, Model model) {
        Note note = noteService.getNoteById(id);
        model.addAttribute("note", note);
        return "noteDetails";
    }

    @PostMapping("/delete/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteService.deleteNoteById(id);
        return "redirect:/notes";
    }

}
