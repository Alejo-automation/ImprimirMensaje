package com.co.screenplay.prueba;

public class Persona {
    private String nombre, apellido;
    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellido = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nombre, apellido);
    }
}
