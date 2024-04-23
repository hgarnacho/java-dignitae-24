<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Números Pares</title>
    </head>
    <body>
        <h1>Números pares del 0 al 100</h1>
        <%
            for(int i = 0 ; i <= 100 ; i++){
                if(0 ==  (i % 2)){
                    out.println("<h2>" + i + "</h2>")           
                }
            }
        %>
    </body>
</html>
