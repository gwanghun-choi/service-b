package com.example.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/b/status")
    public String status() {
        return "[v2] B OK";
    }

    @GetMapping("/b/health")
    public String health() {
        return "200";
    }
}