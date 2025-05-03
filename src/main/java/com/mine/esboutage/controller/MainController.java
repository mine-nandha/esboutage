package com.mine.esboutage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {
    @GetMapping("/hello")
    public String hello(String message){
        return "hello " + message;
    }
}
