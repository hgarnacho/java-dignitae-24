package bd01_conexionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Inicio {

	public static void main(String[] args) {
		String host = "localhost";
		String puerto = "3306";
		String esquema = "almacen";
		String login = "curso";
		String password = "curso";
		String cadenaConexion = "jdbc:mysql://" + 
				host +":" + 
				puerto + "/" +
				esquema;
        try {
			Connection conexion= DriverManager.getConnection(cadenaConexion, login, password);
			Statement statement = conexion.createStatement();
			System.out.println("Ejecutando consulta: select * from producto");
	        ResultSet resultset = statement.executeQuery("select * from producto");
	        while (resultset.next()) {
			    String modelo = resultset.getString("modelo");
			    System.out.println("MODELO: " + modelo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	         
	}
	
}
