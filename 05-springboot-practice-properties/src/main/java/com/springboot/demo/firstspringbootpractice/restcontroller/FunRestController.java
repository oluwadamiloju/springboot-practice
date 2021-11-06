package com.springboot.demo.firstspringbootpractice.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    //injecting properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    // added endpoint for "/"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!, The time to start being great is " + LocalDateTime.now();
    }

    // new endpoint for workout
    @GetMapping("/workout")
    public String workoutSesh() {
        return "Our workout for today includes walking 3000 steps, 50 squats and 5 \"1 minute\" planks";
    }

    //new endpoint for fortune
    @GetMapping("/fortune")
    public String fortuneTeller() {
        return "Today is your lucky day!";
    }

    //new endpoint for team info
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + "\n Team name: " + teamName;
    }
}