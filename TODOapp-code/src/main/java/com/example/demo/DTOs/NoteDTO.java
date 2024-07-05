package com.example.demo.DTOs;

import java.time.LocalDate;

public record NoteDTO(Long id, String name, LocalDate date) {
}
