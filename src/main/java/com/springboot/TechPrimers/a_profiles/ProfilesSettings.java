package com.springboot.TechPrimers.a_profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profiles")
public class ProfilesSettings {

    @Value("${spring.message}")
    private  String applicationMessage;

    @Value("${server.port}")
    private  String port;

    @GetMapping
    public String message(){
        return "Hello " + applicationMessage + " Port " + port;
    }
}
