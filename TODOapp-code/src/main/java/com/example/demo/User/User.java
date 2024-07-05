package com.example.demo.User;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String userName;
    @NotBlank
    private String userEmail;
    @NotBlank
    private String password;


    public User(String userName, String userEmail, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
    }
}
