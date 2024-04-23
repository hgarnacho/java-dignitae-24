<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.dignitae.jsp04_jdbc.Conexion" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Productos</title>
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/custom.css" rel="stylesheet">    
</head>
<body>
   
    <div id="accordion-container" class="shadow p-3 mb-5 bg-body-tertiary rounded">
        <h1>Lista de Artículos</h1>
        <% 
         try {
            	Conexion mysql = new Conexion("localhost", "3306", "jsp04_jdbc", "curso", "curso");
    	
                if(mysql.conectar()) {
                    ResultSet r = mysql.ejecutarSELECT("SELECT id, marca, modelo, descripcion FROM articulo");

                    out.println("<div class='accordion' id='accordion-articulos'>");
                    boolean primerElemento = true;
                    String ariaExpanded;
                    String show;
                    String collapsed;
                    while (r.next()) {
                        Integer id = r.getInt("id");
                        String marca = r.getString("marca");
                        String modelo = r.getString("modelo");
                        String descripcion = r.getString("descripcion");

                        out.println("<div class='accordion-item'>");
                            out.println("<h2 class='accordion-header'>");
                                out.println("<button class='accordion-button collapsed' type='button' data-bs-toggle='collapse' data-bs-target='#collapse-" + id + "' aria-expanded='false' aria-controls='collapse-" + id + "'>");
                                    out.println("[" + id + "] " + marca + " - " + modelo);
                                out.println("</button>");
                            out.println("</h2>");    
                            out.println("<div id='collapse-" + id + "' class='accordion-collapse collapse' data-bs-parent='#accordion-articulos'>");
                                out.println(descripcion);
                            out.println("</div>");
                        out.println("</div>");                      
                    }
                    out.println("</div>");

                } else {
                    out.println("Conexión BD jsp04_jdbc NO OK");
                }
    	
    	        
        } catch (SQLException e) {
            out.println("Error: " + e.getMessage());
        }
        %>
    </div>
    <script src="resources/js/bootstrap.bundle.min.js"></script>
</body>
</html>