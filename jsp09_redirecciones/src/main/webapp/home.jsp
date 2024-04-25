<%
// Si no estamos logeados, redirigimos a la página de login
if(session == null || session.getAttribute("login_status") == null || !session.getAttribute("login_status").equals("ok")) {
    if (session != null) {
        session.invalidate();
    }
    response.sendRedirect("index.jsp");
} else 
{
// Si la sesión es válida y el usuario está autenticado, continúa mostrando el contenido de la página
%>


<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.ParseException" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta lang="es" charset="UTF-8">
    <title>Bienvenido</title>
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/custom.css" rel="stylesheet">    
</head>
<body>

    <main class="home-container m-auto">

        <div class="container my-5">
            <div class="position-relative p-5 text-center text-muted bg-body border border-dashed rounded-5">
                <button type="button" class="position-absolute top-0 end-0 p-3 m-3 btn-close bg-secondary bg-opacity-10 rounded-pill" aria-label="Close"></button>
                <h1 class="text-body-emphasis"><%= session.getAttribute("login_title") %></h1>
                <h3 class="text-body-emphasis"><%= session.getAttribute("login_message") %></h3>

                <%

                    try {
                        // Parsear la fecha a LocalDate
                        String fechaUltimoLogin = (String)session.getAttribute("fecha_ultimo_login");
                    
                        // Formato de entrada
                        SimpleDateFormat sdfEntrada = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        
                        // Formato de salida
                        SimpleDateFormat sdfSalida = new SimpleDateFormat("dd/MM/yyyy 'a las' HH:mm:ss");
                        
                        // Convertir la fecha y hora
                        Date fechaHora = sdfEntrada.parse(fechaUltimoLogin);
                        String fechaHoraFormateada = sdfSalida.format(fechaHora);
                
                %>

                <p class="col-lg-6 mx-auto mb-4">
                    Hola <%= session.getAttribute("nombre") %> <%= session.getAttribute("apellidos") %>!!!. Tu último inicio de sesión fue el <%= fechaHoraFormateada %>
                </p>

                <% } catch (ParseException e) {
                    // Manejar la excepción de parsing
                    e.printStackTrace();
                } %>
                
                <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
                    <a href="logout" type="button" class="btn btn-primary btn-danger btn-lg px-4 gap-3">Cerrar la sesión</a>
                </div>

            </div>
        </div>
     
</body>
</html>

<%
}
// Cerramos el ámbito del if
%>