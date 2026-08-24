package com.example.JOBNOVA.JOBNOVA.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String oauthId;

    private String name;

    @Column(unique = true)
    private String email;

    private String headline;

    private String location;

    private String summary;

    @ElementCollection
    private List<String> skills;

    private String profileImage;
}