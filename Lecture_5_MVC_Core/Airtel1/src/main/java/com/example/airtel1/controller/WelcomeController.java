package com.example.airtel1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    String getWelcomePage(){
        return "welcome";
    }
}
