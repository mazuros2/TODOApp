package com.example.demo.Note;


import com.example.demo.DTOs.NoteDTO;
import com.example.demo.DTOs.NoteDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteNoteById(@PathVariable Long id){
        noteService.deleteNote(id);
        return new ResponseEntity<>("Note has been deleted.", HttpStatus.OK);
    }

}
