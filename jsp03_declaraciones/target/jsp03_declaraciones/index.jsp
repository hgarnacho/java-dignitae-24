<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp03</title>
</head>
<body>
    <jsp:forward page="ejemplo.jsp" />

    <%!
        int numero = 200;
        String mensaje = "Esto es una app JSP";

        public String obtenerMensaje(){
            return mensaje;
        }
    %>

    <h1>jsp03_declaraciones</h1>
    <ul>
        <li>La variable numero vale: <%= numero %></li>
        <li>El mensaje vale <%= obtenerMensaje() %></li>
        <li>El mensaje vale <%= mensaje %></li>
    </ul>

</body>
</html>
