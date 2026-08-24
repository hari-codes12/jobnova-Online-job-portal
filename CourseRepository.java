package com.example.JOBNOVA.JOBNOVA.repository;
import com.example.JOBNOVA.JOBNOVA.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // No custom query needed yet — default CRUD is enough
}

