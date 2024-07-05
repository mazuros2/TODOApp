package com.example.demo.Note;


import com.example.demo.DTOs.NoteDTO;
import com.example.demo.DTOs.NoteDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("")
    public List<NoteDTO> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public List<NoteDetailsDTO> getNoteDetails(@PathVariable Long id){
        return noteService.getNoteDetails(id);
    }

}
