package com.example.JOBNOVA.JOBNOVA.controller;


import com.example.JOBNOVA.JOBNOVA.service.InternshipService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/internships")
public class InternshipController {
    private final InternshipService service;
    public InternshipController(InternshipService service) { this.service = service; }

    @GetMapping
    public Object all() { return service.all(); }
}
