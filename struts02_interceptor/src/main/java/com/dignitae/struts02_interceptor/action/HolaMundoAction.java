package com.dignitae.struts02_interceptor.action;


import com.opensymphony.xwork2.ActionSupport;
import com.dignitae.struts02_interceptor.model.Mensaje;

public class HolaMundoAction extends ActionSupport {

    //Para ser un Bean, atributo privado
    private Mensaje mensaje;
    
    @Override
    public String execute() throws Exception {
        
        mensaje = new Mensaje("Hola Mundo!");

        // Devuelve el resultado SUCESS
        return SUCCESS;
    }

    //Para seguir el modelo Bean, creamos getters y setters

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
    
}