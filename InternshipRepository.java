package com.example.JOBNOVA.JOBNOVA.repository;
import com.example.JOBNOVA.JOBNOVA.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipRepository extends JpaRepository<Internship, Long> {
    // Default CRUD operations are automatically available
}

