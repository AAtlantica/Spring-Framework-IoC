package com.example;

public class PersonaMapper {

    private final PersonaDTO personaDTO;
    private final PersonaEntity personaEntity;
    public PersonaMapper(PersonaDTO personaDTO,
                         PersonaEntity personaEntity){
        this.personaDTO = personaDTO;
        this.personaEntity = personaEntity;
    }

    public PersonaEntity toEntity(){
        personaEntity.setNombre(personaDTO.getNombre());
        personaEntity.getNombre();
        personaEntity.toString();
        return personaEntity;
    }
}
