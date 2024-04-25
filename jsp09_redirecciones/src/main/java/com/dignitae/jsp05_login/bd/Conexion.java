package com.dignitae.jsp05_login.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	private String host;
	private String puerto;
	private String esquema;
	private String usuario;
	private String password;
	Connection conexion;

	public Conexion(String host, String puerto, String esquema, String usuario, String password) {
		this.host = host;
		this.puerto= puerto;
		this.esquema = esquema;
		this.usuario = usuario;
		this.password = password;
		this.conexion = null;
	}

	public boolean conectar () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Resto del código de conexión aquí
        } catch (ClassNotFoundException e) {
            System.err.println("No se encontró el driver JDBC: " + e.getMessage());
            return false; // O manejo de errores apropiado
        }
        
		try {	
	        String cadenaConexion = "jdbc:mysql://" + this.host + ":" + this.puerto + "/" + this.esquema;
	        this.conexion= DriverManager.getConnection(cadenaConexion, this.usuario, this.password);	            
	        return this.conexion != null;
	        		
	    } catch (SQLException e) {
	    	
	        System.err.println("Error al conectar a la base de datos: " + e.getMessage());
	        return false;
	        
	    }
	}	
	
	public boolean desconectar () {		
		
        try {
        	
        	if (this.conexion != null) {
                this.conexion.close();
        	}
            return true;
            
        } catch (SQLException e) {
        	
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
                return false;                
        }
        
	}
	
	public boolean conexionAbierta() {
		return this.conexion != null;
	}
	
	public ResultSet ejecutarSELECT(String select) {
		
		if(!this.conexionAbierta()) {
			return null;
		}

		Statement s = null;
        ResultSet r = null;
		
		try {
			s = this.conexion.createStatement();
	        r = s.executeQuery(select);
	        return r;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	public int ejecutarINSERT(String insert) {

		try {

			Statement s= this.conexion.createStatement();
	        return s.executeUpdate(insert);
	        
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
	}
	
}