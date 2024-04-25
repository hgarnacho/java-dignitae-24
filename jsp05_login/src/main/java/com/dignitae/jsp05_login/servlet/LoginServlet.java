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
public class LoginServlet extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        session.setAttribute("nombre", "");
        session.setAttribute("apellidos", "");
        session.setAttribute("fecha_ultimo_login", "");

        try{

            Conexion conexion = new Conexion("localhost", "3306", "jsp05_login", "curso", "curso");
            if(conexion.conectar()){

                String cadenaSelect = "SELECT login, password, nombre, apellidos, fecha_ultimo_login FROM usuarios WHERE login = '" + username + "' AND password = '" + password + "'";
                ResultSet resultSet = conexion.ejecutarSELECT(cadenaSelect);

                if( null != resultSet && resultSet.next() ){
                    
                    String nombre = resultSet.getString("nombre");
                    String apellidos = resultSet.getString("apellidos");
                    String fechaUltimoLogin = resultSet.getString("fecha_ultimo_login");
                    
                    session.setAttribute("login_status", "ok");
                    session.setAttribute("login_title", "Login Correcto");
                    session.setAttribute("login_message", "Bienvenido a tu zona privada");
                    session.setAttribute("nombre", nombre);
                    session.setAttribute("apellidos", apellidos);
                    session.setAttribute("fecha_ultimo_login", fechaUltimoLogin);
                    
                    response.sendRedirect("home.jsp");

                } else {

                    session.setAttribute("login_status", "error_login");
                    session.setAttribute("login_title", "Login Incorrecto");
                    session.setAttribute("login_message", "Acceso Denegado");
                    
                    response.sendRedirect("index.jsp");

                }

            } else {
                session.setAttribute("login_status", "error_bd");
                session.setAttribute("login_title", "Error de conexión");
                session.setAttribute("login_message", "No se ha podido conectar a la BD");
    
                response.sendRedirect("index.jsp");
            }

        } catch (SQLException e){
            session.setAttribute("login_status", "error_bd");
            session.setAttribute("login_title", "Error de conexión");
            session.setAttribute("login_message", e.getMessage());

            response.sendRedirect("index.jsp");
        }   
        
    }


}
