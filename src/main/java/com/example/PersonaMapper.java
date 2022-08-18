package com.example;

public class PersonaMapper {

    private final PersonaEntity personaEntity;
    private final PersonaDTO personaDTO;

    public PersonaMapper(PersonaEntity personaEntity,
                         PersonaDTO personaDTO){
        this.personaEntity = personaEntity;
        this.personaDTO = personaDTO;
    }

    public PersonaEntity toEntity(){

        personaEntity.setNombre(personaDTO.getNombre());

        return personaEntity;
    }

}
