package com.klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Demo!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "This is Spring Boot demo application";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "This is a good day!";
    }
}
