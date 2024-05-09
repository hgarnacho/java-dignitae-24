package com.dignitae.struts01_holamundo.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistroAction extends ActionSupport {
    
    private String nombre;
    private String email;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String execute() throws Exception {
        // Lógica de negocio
        return SUCCESS;
    }
}