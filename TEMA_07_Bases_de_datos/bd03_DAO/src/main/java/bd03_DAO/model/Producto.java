package bd03_DAO.model;

public class Producto {

	private Integer id;
	private String marca;
	private String modelo;
	private Double precio;
	private int stock;

	public Producto(Integer id, String marca, String modelo, Double precio, int stock) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", stock="
				+ stock + "]";
	}

}
