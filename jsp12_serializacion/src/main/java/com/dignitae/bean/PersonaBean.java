package com.dignitae.bean;

import java.io.Serializable;

public class PersonaBean implements Serializable {
    // Propiedades
    private String nombre;
    private int edad;
    private char genero;

    // Constructor sin argumentos
    public PersonaBean() {
    }

    // Constructor con argumentos
    public PersonaBean(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Métodos getter y setter para la propiedad "nombre"
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para la propiedad "edad"
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos getter y setter para la propiedad "genero"
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Método toString para imprimir los detalles de la persona
    @Override
    public String toString() {
        return "{" +
                "\"nombre\": \"" + nombre + "\", " +
                "\"edad\": " + edad + ", " + 
                "\"genero\": \"" + genero + "\"" +
                "}";
    }
}