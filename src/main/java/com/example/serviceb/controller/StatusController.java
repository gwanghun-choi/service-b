package com.example.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/b/status")
    public String status() {
        return "B OK";
    }

    @GetMapping("/a/health")
    public String health() {
        return "200";
    }
}