<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.dignitae.jsp11.beans.bean.PersonaBean" %>

<!DOCTYPE html>
<html>
<head>
    <title>Detalles de Persona</title>
</head>
<body>
    <h2>Detalles de Persona</h2>

    <%
        PersonaBean pb = (PersonaBean) session.getAttribute("persona");
    %>

    <p>Nombre: <%= pb.getNombre() %></p>
    <p>Edad:  <%= pb.getEdad() %></p>
    <p>Género:  <%= pb.getGenero() %></p>
</body>
</html>