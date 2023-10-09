package com.co.screenplay.prueba;

public class Prueba {
    public static void main(String[] args) {
       Mensaje msg = new Mensaje();
        String nombre = msg.solictaDatos("Escribe tu nombre: ");
        String apellidos = msg.solictaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);
    }
}
