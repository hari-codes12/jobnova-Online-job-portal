package com.example.JOBNOVA.JOBNOVA.controller;

import com.example.JOBNOVA.JOBNOVA.service.LearningService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")  // ✅ changed this line
@CrossOrigin(origins = "*")
public class LearningController {

    private final LearningService service;
    public LearningController(LearningService service) { this.service = service; }

    @GetMapping
    public Object all() { return service.all(); }
}
