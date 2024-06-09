package com.login.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sign_up {
    @RequestMapping("/sign")
    public String log(){
        return "You are succesfully SignUp";
    }
    
}
