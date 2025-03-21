package com.konveyor.springlogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String userEndpoint() {
        return "Welcome, User!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Welcome, Admin!";
    }
    
}