package com.example;

public class PersonaEntity {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PersonaEntity{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
