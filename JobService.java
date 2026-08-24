package com.example.JOBNOVA.JOBNOVA.service;


import com.example.JOBNOVA.JOBNOVA.model.Job;
import com.example.JOBNOVA.JOBNOVA.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {
    private final JobRepository repo;
    public JobService(JobRepository repo) { this.repo = repo; }

    public List<Job> all() { return repo.findAll(); }

    public List<Job> searchBySkill(String skill) { return repo.findBySkillsContainingIgnoreCase(skill); }
}
