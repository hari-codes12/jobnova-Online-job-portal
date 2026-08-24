package com.example.JOBNOVA.JOBNOVA.controller;

import com.example.JOBNOVA.JOBNOVA.service.CertificationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/certifications")
public class CertificationController {
    private final CertificationService service;
    public CertificationController(CertificationService service) { this.service = service; }

    @GetMapping
    public Object all() { return service.all(); }
}
