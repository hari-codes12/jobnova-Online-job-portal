package com.example.JOBNOVA.JOBNOVA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/saved-job")
    public String savedJob() {
        return "saved-job";
    }
}