package bd03_DAO.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd03_DAO.model.Producto;

import bd03_DAO.jdbc.Conexion;

public class ProductoDAO {

	private Conexion conexion;
	
	public ProductoDAO() {
		//Instanciamos la conexion con los parametros por defectos establecidos en la propia conexion
		this.conexion = new Conexion();
	}
	
    // Método para agregar un nuevo producto a la base de datos
    public int addProducto(Producto producto) {
        String sql = "INSERT INTO producto " +
        		"(id, marca, modelo, precio, stock) " +
        		"VALUES (" +
        		"null, " +
        		"'" + producto.getMarca() + "'," +
        		"'" + producto.getModelo()+ "'," +
        		"'" + producto.getPrecio() + "'," +
        		"'" + producto.getStock() + "'" +
        		")";
        System.out.println("DAO -> " + sql);
        this.conexion.conectar();
        return this.conexion.ejecutarINSERT(sql);
    }

    // Método para obtener un producto por su ID
    public Producto getProductoById(int id) {
        String sql = "SELECT id, marca, modelo, precio, stock FROM producto WHERE id = " + id;
        
        this.conexion.conectar();
        ResultSet resultset = conexion.ejecutarSELECT(sql);
        		
        try {
			if (resultset.next()) {
			   return new Producto(
					   resultset.getInt("id"),
					   resultset.getString("marca"),
					   resultset.getString("modelo"),
			           resultset.getDouble("precio"),
			           resultset.getInt("stock")
			   );
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}       
    }

    // Método para obtener un producto por un campo
    public Producto getProductoByField(String campo, String valor) {
        String sql = "SELECT id, marca, modelo, precio, stock FROM producto WHERE " + campo +" = '" + valor + "'";
        
        conexion.conectar();
        ResultSet resultset = conexion.ejecutarSELECT(sql);
        		
        try {
			if (resultset.next()) {
			   return new Producto(
					   resultset.getInt("id"),
					   resultset.getString("marca"),
					   resultset.getString("modelo"),
			           resultset.getDouble("precio"),
			           resultset.getInt("stock")
			   );
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}       
    }

	// Método para obtener un producto por un campo
	public ArrayList<Producto> getProductosByField(String campo, String valor) {
		String sql = "SELECT id, marca, modelo, precio, stock FROM producto WHERE " + campo + " = '" + valor + "'";
			
		conexion.conectar();
		ResultSet resultset = conexion.ejecutarSELECT(sql);

		ArrayList<Producto> resultadoProductos = new ArrayList<>();

		try {
			while (resultset.next()) {
			    resultadoProductos.add(
					new Producto(
					   resultset.getInt("id"),
					   resultset.getString("marca"),
					   resultset.getString("modelo"),
					   resultset.getDouble("precio"),
					   resultset.getInt("stock")
					)
			   	);
			} 
			return resultadoProductos;
		} catch (SQLException e) {
			e.printStackTrace();
			return resultadoProductos;
		}       
	}

    
}
