<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta lang="es" charset="UTF-8">
    <title>Iniciar Sesión</title>
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/custom.css" rel="stylesheet">    
</head>
<body>

    <main class="form-signin w-100 m-auto">

        <form method="post" action="validar_login">
        
            <h1 class="h3 mb-3 fw-normal">Por favor, inicia sesión</h1>

            <% 
                Object loginStatus = session.getAttribute("login_status"); 
                
                //Si ya hemos conseguido realizar el login, redireccionamis directamente a la home
                //Esto es un ejercicio, en un entorno real deberíamos analizar bien este tipo de cosas.

                if(null != loginStatus && loginStatus.equals("ok")){
                     response.sendRedirect("home.jsp");
                }
            %>
            
            <% if (null != loginStatus && (loginStatus.equals("error_login") || loginStatus.equals("error_bd"))) { %>
                <div class="alert alert-danger" role="alert">
                    <h4 class="alert-heading"><%= session.getAttribute("login_title") %></h4>
                    <hr>
                    <p class="mb-0"><%= session.getAttribute("login_message") %></p>
                </div>
            <% } %>

            <div class="form-floating">
                <input type="text" class="form-control" id="username" name="username" placeholder="Nombre de usuario" autofocus>
                <label for="username">Nombre de usuario</label>
            </div>
            
            <div class="form-floating">
                <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña">
                <label for="password">Password</label>
            </div>
            
            <button class="btn btn-primary w-100 py-2" type="submit">Iniciar sesión</button>
            
        </form>
 
    </main>

    <script src="resources/js/bootstrap.bundle.min.js"></script>

</body>
</html>