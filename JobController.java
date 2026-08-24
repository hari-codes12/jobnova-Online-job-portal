package com.example.JOBNOVA.JOBNOVA.controller;


import com.example.JOBNOVA.JOBNOVA.model.Job;
import com.example.JOBNOVA.JOBNOVA.service.JobService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobService service;
    public JobController(JobService service) { this.service = service; }

    @GetMapping
    public List<Job> all() { return service.all(); }

    @GetMapping("/search")
    public List<Job> search(@RequestParam String skill) {
        return service.searchBySkill(skill);
    }
}
