package com.example.CarServicePart_1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePageConroller {
    @RequestMapping("/welcome")
    public String welcomePage(){
        return "welcome";
    }
}
