package com.example.demo.DTOs;

import java.time.LocalDate;

public record NoteDetailsDTO(Long id, String title, String category, LocalDate date, String description) {
}
