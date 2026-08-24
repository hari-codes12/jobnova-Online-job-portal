package com.example.JOBNOVA.JOBNOVA.service;



import com.example.JOBNOVA.JOBNOVA.model.Internship;
import com.example.JOBNOVA.JOBNOVA.repository.InternshipRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InternshipService {
    private final InternshipRepository repo;
    public InternshipService(InternshipRepository repo) { this.repo = repo; }

    public List<Internship> all() { return repo.findAll(); }
}

