package com.springboot.TechPrimers.a_profiles.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("custom")
@Configuration
public class JavaDevConfig {

    @PostConstruct
    public void test(){
        System.out.println("Loaded Custom Profile");
    }
}
