package com.example.CarServicePart_1.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String getRegistrationPage(){
        return "carregister";
    }


}
