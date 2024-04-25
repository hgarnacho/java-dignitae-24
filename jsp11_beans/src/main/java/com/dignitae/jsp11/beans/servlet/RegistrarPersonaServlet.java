package com.dignitae.jsp11.beans.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.dignitae.jsp11.beans.bean.PersonaBean;

@WebServlet("/registrar_persona")
public class RegistrarPersonaServlet extends HttpServlet {

    //POST -> llamar desde postman, se le envia como parámetro en el body la info de la persona
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        char genero = request.getParameter("genero").charAt(0);
        
        // Crear objeto Persona
        PersonaBean persona = new PersonaBean(nombre, edad, genero);
        
        HttpSession session = request.getSession();
        session.setAttribute("persona", persona);
                    
        response.sendRedirect("mostrar_persona.jsp");
        
    }

    //Llamada get http://localhost:8080/jsp11_beans/registrar_persona?nombre=Luis&edad=20&genero=M
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");

        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        char genero = request.getParameter("genero").charAt(0);

        // Crear objeto Persona
        PersonaBean persona = new PersonaBean(nombre, edad, genero);

        // Escribir la respuesta JSON en el cuerpo de la respuesta
        PrintWriter out = response.getWriter();
        out.print(persona.toString());
        out.flush();    
    }

}