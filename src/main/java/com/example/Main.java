package com.example;

public class Main {

    public static void main(String[] args) {
        PersonaDTO personaDTO = new PersonaDTO();
        personaDTO.setNombre("AdrianDTO");

        PersonaEntity personaEntity = new PersonaEntity();

        PersonaMapper personaMapper = new PersonaMapper(personaDTO, personaEntity);
        PersonaEntity persona = personaMapper.toEntity();

        System.out.println(persona);

    }
}
