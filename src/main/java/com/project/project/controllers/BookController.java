package com.project.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from Home !";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from /hello endpoint!";
    }
}
