package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonaDTO personaDTO(){
        return new PersonaDTO();
    }

    @Bean
    public PersonaEntity personaEntity(){
        return new PersonaEntity();
    }

    @Bean
    public PersonaMapper personaMapper(){
        return new PersonaMapper(personaEntity(), personaDTO());
    }
}
