package com.educ.api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Home {

    @GetMapping("/what")
    public String HomeMundo(){
        return "Me api rest";
    }
}
