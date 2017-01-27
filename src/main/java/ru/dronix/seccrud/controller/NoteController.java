package ru.dronix.seccrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dronix.seccrud.model.Note;
import ru.dronix.seccrud.service.NoteService;

/**
 * Created by ADMIN on 13.01.2017.
 */
@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("count",this.noteService.getCount());

        return "index";
    }

    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create(Model model){
        model.addAttribute("note",new Note());
        model.addAttribute("listNotes",this.noteService.listNotes());

        return "create";
    }

    @RequestMapping(value = "/create/add",method = RequestMethod.POST)
    public String addAndUpdate(@ModelAttribute("note")Note note){
        if(note.getId()==0){
            this.noteService.addNote(note);
            return "redirect:/create";
        }else{
            this.noteService.updateNote(note);
            return "redirect:/update";
        }
    }

    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public String deletePage(Model model){
        model.addAttribute("listNotes",this.noteService.listNotes());

        return "delete";
    }

    @RequestMapping("/delete/{id}")
    public String deleteNote(@PathVariable("id") int id){
        this.noteService.removeNote(id);

        return "redirect:/delete";
    }

    @RequestMapping(value = "notes",method = RequestMethod.GET)
    public String listBooks(Model model){
        model.addAttribute("notes",this.noteService.listNotes());

        return "notes";
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String updatePage(Model model){
        model.addAttribute("listNotes",this.noteService.listNotes());

        return "update";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String update(@PathVariable("id")int id,Model model){
        model.addAttribute("note",this.noteService.getNoteById(id));
        model.addAttribute("listNotes",this.noteService.listNotes());

        return "update";
    }
}
