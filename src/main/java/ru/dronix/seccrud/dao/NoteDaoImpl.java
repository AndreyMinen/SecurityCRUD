package ru.dronix.seccrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.dronix.seccrud.model.Note;

import java.util.Date;
import java.util.List;

/**
 * Created by ADMIN on 13.01.2017.
 */
@Repository
public class NoteDaoImpl implements NoteDao {

    @Autowired
    private SessionFactory sessionFactory;
    private Date date=new Date();

    public void addNote(Note note) {
        Session session=this.sessionFactory.getCurrentSession();
        note.setDate(date);
        session.persist(note);
    }

    public void updateNote(Note note) {
        Session session=this.sessionFactory.getCurrentSession();
        note.setDate(date);
        session.update(note);
    }

    public void removeNote(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        Note note=(Note)session.load(Note.class,new Integer(id));
        if(note!=null){
            session.delete(note);
        }
    }

    public Note getNoteById(int id) {
        Session session=this.sessionFactory.getCurrentSession();
        Note note=(Note)session.load(Note.class,new Integer(id));
        System.out.println(note);
        return note;
    }

    public List<Note> listNotes() {
        Session session=this.sessionFactory.getCurrentSession();
        return (List<Note>)session.createCriteria(Note.class).list();
    }

    public int getCount() {
        Session session=this.sessionFactory.getCurrentSession();
        int count=((Long)(session.createCriteria(Note.class).setProjection(Projections.rowCount()).uniqueResult())).intValue();
        return count;
    }
}
