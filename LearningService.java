package com.example.JOBNOVA.JOBNOVA.service;



import com.example.JOBNOVA.JOBNOVA.model.Course;
import com.example.JOBNOVA.JOBNOVA.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LearningService {
    private final CourseRepository repo;
    public LearningService(CourseRepository repo) { this.repo = repo; }

    public List<Course> all() { return repo.findAll(); }
}
