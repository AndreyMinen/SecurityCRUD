package ru.dronix.seccrud.service;

import ru.dronix.seccrud.model.Note;

import java.util.List;

/**
 * Created by ADMIN on 13.01.2017.
 */
public interface NoteService {
    void addNote(Note note);
    void updateNote(Note note);
    void removeNote(int id);
    Note getNoteById(int id);
    List<Note> listNotes();
    int getCount();
}
