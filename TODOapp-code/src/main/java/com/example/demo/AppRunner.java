package com.example.demo;

import com.example.demo.Note.Note;
import com.example.demo.Note.NoteRepository;
import com.example.demo.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        Note note1 = new Note("Uni project","University","Create a project in spring boot with reactJS", LocalDate.now());
        Note note2 = new Note("Resolve 2 Leetcode problems","University","Resolve 2 leetcode problems with binary search", LocalDate.now());
        Note note3 = new Note("Grocery shop", "Shop", "Buy water and snacks", LocalDate.now());

        noteRepository.save(note1);
        noteRepository.save(note2);
        noteRepository.save(note3);
    }
}
