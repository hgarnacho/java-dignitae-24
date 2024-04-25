package com.dignitae.jsp08_servletjson.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/json")
public class EjemploJsonServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //establecemos el tipo de respuesta
        response.setContentType("application/json");

        //Objtenemos el objeto out desde el response
        PrintWriter out = response.getWriter();
        //Generamos el JSON
        String json = generateJson();

        //Escribimos el JSON en el out
        out.println(json);
        out.flush();
        //Cerramos el out
        out.close();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //establecemos el tipo de respuesta
        response.setContentType("application/json");

        //Objtenemos el objeto out desde el response
        PrintWriter out = response.getWriter();
        //Generamos el JSON
        String json = generateJson();

        //Escribimos el JSON en el out
        out.println(json);
        out.flush();
        //Cerramos el out
        out.close();
        
    }

    private String generateJson(){

        // Crear datos JSON de ejemplo
        // Escapamos las comillas dobles ya que el formato JSON requiere "
        String jsonString = "{\"nombre\": \"Juan\", \"edad\": 23, \"ciudad\": \"Valladolid\", \"telefonos\": [\"983112233\",\"654321879\"]}";
        return jsonString;

    }

}
