package com.celerbuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    private static final String VERSION = "1.0.1";

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World from CelerBuild!");
        return response;
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        Map<String, String> response = new HashMap<>();
        response.put("version", VERSION);
        return response;
    }
}