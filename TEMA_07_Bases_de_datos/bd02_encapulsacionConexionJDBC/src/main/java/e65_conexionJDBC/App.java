package e65_conexionJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
    	Conexion mysql = new Conexion("localhost", "3306", "almacen", "curso", "curso");

    	if(mysql.conectar()) {
    		System.out.println("Conexión BD OK");
    	} else {
    		System.out.println("Conexión BD NO OK");
    	}
    	
    	ResultSet r = mysql.ejecutarSELECT("SELECT id, marca, modelo, precio, stock from producto");
    	try {
			while (r.next()) {
				// Imprimir cada fila de la tabla
			    int id = r.getInt("id");
			    String marca = r.getString("marca");
			    String modelo = r.getString("modelo");
			    double precio = r.getDouble("precio");
			    int stock = r.getInt("stock");
			    System.out.println("ID: " + id + ", MARCA: " + marca + ", MODELO: " + modelo + ", PRECIO: " + precio + ", STOCK: " + stock);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	int filasInsertadas = mysql.ejecutarINSERT("INSERT INTO producto (id, marca, modelo, precio, stock) VALUES (null, 'Puma', 'MCity', 70.00, 18);");
    	System.out.println("Filas insertadas: " + filasInsertadas);
    	
    	mysql.desconectar();
   }
}