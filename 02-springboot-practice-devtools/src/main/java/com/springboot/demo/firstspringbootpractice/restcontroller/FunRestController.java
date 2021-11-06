package com.springboot.demo.firstspringbootpractice.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    // added endpoint for "/"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!, The time to start being great is " + LocalDateTime.now();
    }

    // new endpoint for workout page "/workout"
    @GetMapping("/workout")
    public String workoutSesh() {
        return "Our workout for today includes walking 3000 steps, 50 squats and 5 \"1 minute\" planks";
    }
}
