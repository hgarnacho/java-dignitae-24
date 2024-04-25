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

        <main id="home-container" class="w-100 m-auto">

            <form id="form-login" method="post" action="validar_login">
                
                <h1 class="h3 mb-3 fw-normal">Por favor, inicia sesión</h1>

                <% 
                    Object loginStatus = session.getAttribute("login_status"); 
                %>
                    
                <% if (null != loginStatus && (loginStatus.equals("error_login") || loginStatus.equals("error_bd"))) { %>
                    <div class="alert alert-danger" role="alert">
                        <h4 class="alert-heading"><%= session.getAttribute("login_title") %></h4>
                        <hr>
                        <p class="mb-0"><%= session.getAttribute("login_message") %></p>
                    </div>
                <% } %>

                <div class="form-floating">
                    <input type="text" class="form-control" id="username" name="username" placeholder="Nombre de usuario" autofocus maxlength="30" required>
                    <label for="username">Nombre de usuario</label>
                </div>
                    
                <div class="form-floating">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña" maxlength="30" required>
                    <label for="password">Password</label>
                </div>
                    
                <button class="btn btn-primary w-100 py-2" type="submit">Iniciar sesión</button>
                    
            </form>
        
        </main>


        <script src="resources/js/bootstrap.bundle.min.js"></script>

    </body>
    
</html>