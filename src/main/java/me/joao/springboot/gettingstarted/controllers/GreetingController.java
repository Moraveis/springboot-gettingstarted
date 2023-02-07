package me.joao.springboot.gettingstarted.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
        return "Greetings! It is " + LocalDateTime.now();
    }
}
