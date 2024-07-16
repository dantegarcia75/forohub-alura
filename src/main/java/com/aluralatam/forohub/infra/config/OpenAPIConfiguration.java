package com.aluralatam.forohub.infra.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenApi() {
        Contact myContact = new Contact();
        myContact.setName("Dante Garcia");
        myContact.setEmail("dante.m.garcia.75@gmail.com");

        Info information = new Info()
                .title("API REST de ForoHub Alura")
                .version("1.00")
                .description("Esta API expone endpoints para administrar topicos.")
                .contact(myContact);
        return new OpenAPI().info(information);
    }
}
