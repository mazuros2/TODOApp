package com.example.demo.Note;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String category;
    @NotBlank
    private String description;
    @NotNull
    private LocalDate date;

    public Note(String name, String category, String description, LocalDate date) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.date = date;
    }
}
