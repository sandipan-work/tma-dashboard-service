package com.sandipan.work.tma.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value="/getWelcomeMessage")
    public String getWelcomeMessage(){
        return "Hello World";
    }
}
