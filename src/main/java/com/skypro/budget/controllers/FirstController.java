package com.skypro.budget.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class FirstController {

    @GetMapping
    public String startApp(){
        return "Start App";
    }

    @GetMapping("/info")
    public String info(){
        String name = "Evgeniy";
        String nameProject = "Budget";
        LocalDate date = LocalDateTime.now().toLocalDate();
        String description = "Test Project";
        return "Name student: " + name + "\n" +
                "Name Project: " + nameProject + "\n" +
                "Date: " + date + "\n" +
                "Description: " + description + "\n";
    }
}
