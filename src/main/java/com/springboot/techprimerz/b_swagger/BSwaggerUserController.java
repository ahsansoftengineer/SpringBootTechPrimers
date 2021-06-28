package com.springboot.techprimerz.b_swagger;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/swagger/user")
public class BSwaggerUserController {
    // Default
    @GetMapping()
    public String message(){
        return "Swagger / User is working";
    }
    @GetMapping("/users")
    public List<SwaggerUser> userGet(){
        return Arrays.asList(
                new SwaggerUser(1, "Ahsan", "Male"),
                new SwaggerUser(2, "Asma", "Female"),
                new SwaggerUser(3, "Sumaya", "Female")
        );
    }

    @PostMapping("/adduser")
    public SwaggerUser userPost(@RequestBody final SwaggerUser user){
        return user;
    }

    @PutMapping("/{id}")
    public SwaggerUser userPut(@PathVariable final int id){
        return new SwaggerUser(id, "John Morson", "Male");
    }

}
