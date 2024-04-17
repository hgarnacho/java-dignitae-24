import java.util.ArrayList;

import bd03_DAO.dao.ProductoDAO;
import bd03_DAO.model.Producto;


public class Inicio {

	public static void main(String[] args) {
		
		ProductoDAO pDAO = new ProductoDAO();
		Producto p = new Producto(
				null,
				"EJEMPLO",
				"EJEMPLO",
				99.99,
				1000);
		
		int r = pDAO.addProducto(p);
		if(r > 0) {
			System.out.println("Producto añadido correctamente");			
		}

		Producto p2 = pDAO.getProductoById(5);
		if(p2 != null) {
			System.out.println(p2);
		}


		ArrayList<Producto> productos = pDAO.getProductosByField("marca", "Puma");
		for(Producto p3 : productos) {
			System.out.println(p3);
		}

	}

}
