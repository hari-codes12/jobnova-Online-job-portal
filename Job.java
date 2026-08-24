package com.example.JOBNOVA.JOBNOVA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String company;
    private String location;
    private String description;
    private String skills;

    private String experience;
    private String education;
    private String passoutYear;
    private String salary;
    private String jobType;
}