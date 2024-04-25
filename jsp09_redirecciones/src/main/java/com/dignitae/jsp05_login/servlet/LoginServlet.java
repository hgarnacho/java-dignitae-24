package com.dignitae.jsp05_login.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dignitae.jsp05_login.bd.Conexion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/validar_login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        session.setAttribute("nombre", "");
        session.setAttribute("apellidos", "");
        session.setAttribute("fecha_ultimo_login", "");

        try {
            Conexion mysql = new Conexion("localhost", "3306", "jsp05_login", "curso", "curso");
    
            if(mysql.conectar()) {
                String cadenaSelect ="SELECT ";
                cadenaSelect += "login, password, nombre, apellidos, fecha_ultimo_login "; 
                cadenaSelect += "FROM usuarios where login='" + username + "' and password='" + password + "';";
                System.out.println(cadenaSelect);
                ResultSet r = mysql.ejecutarSELECT(cadenaSelect);

                if(null != r && r.next()) {
                    String nombre = r.getString("nombre");
                    String apellidos = r.getString("apellidos");
                    String fecha_ultimo_login = r.getString("fecha_ultimo_login");
                    // Credenciales válidas, redirigir a la página de bienvenida
                    //Podemos escribir el estado del login en la sesion, para saber que estamos logeados.
                    session.setAttribute("login_status", "ok");
                    session.setAttribute("login_title", "Login correcto");                    
                    session.setAttribute("login_message", "Bienvenido a tu zona privada!!");                    
                    session.setAttribute("nombre", nombre);
                    session.setAttribute("apellidos", apellidos);
                    session.setAttribute("fecha_ultimo_login", fecha_ultimo_login);
                    
                    response.sendRedirect("home.jsp");
                } else {
                    session.setAttribute("login_status", "error_login");
                    session.setAttribute("login_title", "Acceso denegado");                    
                    session.setAttribute("login_message", "Nombre de usuario o contraseña incorrectos");    
                    response.sendRedirect("index.jsp");                
                }

            } else {
                session.setAttribute("login_status", "error_bd");
                session.setAttribute("login_title", "No se han podido comprobar las credenciales");                    
                session.setAttribute("login_message", "Error conectando a la Base de Datos");    
                response.sendRedirect("index.jsp");                
            }
            
        } catch (SQLException e) {
            session.setAttribute("login_status", "error_bd");
            session.setAttribute("login_message", e.getMessage());                    
        }

    }
}