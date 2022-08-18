package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        PersonaDTO personaDTO = (PersonaDTO) applicationContext.getBean("personaDTO");
        PersonaMapper personaMapper = ( PersonaMapper) applicationContext.getBean("personaMapper");

        personaDTO.setNombre("AdrianDTO");

        PersonaEntity persona = personaMapper.toEntity();

        System.out.println(persona);

    }

}
