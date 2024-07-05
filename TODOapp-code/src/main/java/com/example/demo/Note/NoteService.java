package com.example.demo.Note;

import com.example.demo.DTOs.NoteDTO;
import com.example.demo.DTOs.NoteDetailsDTO;
import com.example.demo.Exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<NoteDTO> getAllNotes(){
        return noteRepository.findAll().stream().map(note -> new NoteDTO(
                note.getId(),
                note.getTitle(),
                note.getDate())).toList();
    }

    public List<NoteDetailsDTO> getNoteDetails(Long id){
        if(noteRepository.existsById(id)){
            return noteRepository.findById(id).stream().map(note -> new NoteDetailsDTO(
                    note.getId(),
                    note.getTitle(),
                    note.getCategory(),
                    note.getDate(),
                    note.getDescription())).toList();

        }else{
            throw new NotFoundException("This note doesn't exists: " + id);
        }
    }

    public void deleteNote(Long id){
        if(noteRepository.existsById(id)){
            noteRepository.deleteById(id);
        }else{
            throw new NotFoundException("This note doesn't exists: " + id);
        }
    }


}
