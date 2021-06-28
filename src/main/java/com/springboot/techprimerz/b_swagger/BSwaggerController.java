package com.springboot.techprimerz.b_swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080/swagger-ui/index.html
@RestController
@RequestMapping("/swagger/home")
@Api(value = "Ahsan Class Level Annotation", description = "Ahsan Description")
public class BSwaggerController {
    // Default
    @ApiOperation(value = "Return Swagger Welcome")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 Ahsan message"),
                    @ApiResponse(code = 200, message = "200 Ahsan OK")
            }
    )
    @GetMapping
    public String hello(){
        return "Swagger Welcome";
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello){
        return "Swagger Post " + hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello){
        return "Swagger Put " + hello;
    }

}
