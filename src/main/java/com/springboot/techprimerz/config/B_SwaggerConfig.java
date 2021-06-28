package com.springboot.techprimerz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// Don't Touch that it is Working
// http://localhost:8080/swagger-ui/index.html
@Configuration
public class B_SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("My Reactive API")
                        .title("My Domain object API")
                        .version("1.0.0")
                        .build())
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.techprimerz"))
                .paths(PathSelectors.any())
                .build().apiInfo(metaInfo());

    }
    private ApiInfo metaInfo(){
        return new ApiInfoBuilder()
                .version("Ahsan Version")
                .title("Ahsan Title")
                .description("Ahsan Description")
                .license("Ahsan License")
                .licenseUrl("License URL")
                .termsOfServiceUrl("Service URL")
                .contact(new Contact("Contact Name", "Contact URL",  "Contact Email"))
                .build()                    ;
    }
}
