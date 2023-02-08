package me.joao.springboot.gettingstarted.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetingController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String greeting() {
        return "Greetings! It is " + LocalDateTime.now();
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach name = " + coachName + " - team name = " + teamName;
    }
}
