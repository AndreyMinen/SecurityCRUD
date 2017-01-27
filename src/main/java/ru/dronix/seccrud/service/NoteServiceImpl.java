package ru.dronix.seccrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dronix.seccrud.dao.NoteDao;
import ru.dronix.seccrud.model.Note;

import java.util.List;

/**
 * Created by ADMIN on 13.01.2017.
 */
@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao noteDao;

    @Transactional
    public void addNote(Note note) {
        this.noteDao.addNote(note);
    }

    @Transactional
    public void updateNote(Note note) {
        this.noteDao.updateNote(note);
    }

    @Transactional
    public void removeNote(int id) {
        this.noteDao.removeNote(id);
    }

    @Transactional
    public Note getNoteById(int id) {
        return this.noteDao.getNoteById(id);
    }

    @Transactional
    public List<Note> listNotes() {
        return this.noteDao.listNotes();
    }

    @Transactional
    public int getCount() {
        return this.noteDao.getCount();
    }
}
