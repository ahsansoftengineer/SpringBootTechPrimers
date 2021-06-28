package com.springboot.techprimerz.config;

//@Profile("custom")
//@Configuration
public class A_ProfileConfig {

//    @PostConstruct
    public void test(){
        System.out.println("Loaded Custom Profile");
    }
}
