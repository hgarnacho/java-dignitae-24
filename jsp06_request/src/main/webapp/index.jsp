<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Página JSP</title>
    </head>
    <body>
        <h1>Información de la petición (request)</h1>
    
        <%
            //Recogemos un parámetro y lo mostramos en pantalla
            String nombre = request.getParameter("nombre");
            out.println("<h2>Hola " + nombre + "!");

            //Escribimos en la sesión
            session.setAttribute("nombre", nombre);
            session.setAttribute("ciudad", "Valladolid");
            session.setAttribute("saludo", "Hola Mundo!");
        %>
    
        <ul>
            <li>Nombre (Parametro GET): <%= request.getParameter("nombre") %> </li>
            <li>ciudad (Atributo de SESSION):  <%= request.getSession().getAttribute("ciudad") %> </li>
            <li>URL de la solicitud: <%= request.getRequestURL().toString() %> </li>
            <li>Método de la solicitud: <%= request.getMethod() %> </li>
            <li>Header de la solicitud (User Agent): <%= request.getHeader("user-Agent") %> </li>
            <li>Mensaje (Atributo en Request): <%= request.getAttribute("saludo") %> </li>
        <ul>


    </body>
</html>