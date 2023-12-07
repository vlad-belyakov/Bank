package com.lesson.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/clients")
public class clientController {

    @GetMapping
    public String getInfo(@RequestParam("name") String name){
        return name;
    }

}
