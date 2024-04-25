package com.dignitae.jsp07_servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/holamundo")
public class HolaMundoServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Hola Mundo!!!</title></head>");
        out.println("<body>");
        out.println("<h1>Hola Mundo des de un Servlet!!");
        out.println("<p>Este es nuestro primer servlet</p>");
        out.println("</body>");
        out.println("</html>");
    }


}
