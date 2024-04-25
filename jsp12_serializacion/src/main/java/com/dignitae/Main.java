package com.dignitae;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.dignitae.bean.PersonaBean;

public class Main {
    public static void main(String[] args) {
    PersonaBean pb = new PersonaBean("Luis", 30, 'M');

    //serializamos
    try {
        FileOutputStream fileOut = new FileOutputStream("d:\\personaBean.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(pb);
        out.close();
        fileOut.close();
        System.out.println("El objeto ha sido serializado y guardado en personaBean.ser");
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}