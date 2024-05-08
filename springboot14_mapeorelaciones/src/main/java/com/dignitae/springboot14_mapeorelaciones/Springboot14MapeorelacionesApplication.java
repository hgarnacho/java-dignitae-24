package com.dignitae.springboot14_mapeorelaciones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dignitae.springboot14_mapeorelaciones.entities.ClienteEntity;
import com.dignitae.springboot14_mapeorelaciones.entities.FabricanteEntity;
import com.dignitae.springboot14_mapeorelaciones.entities.PedidoEntity;
import com.dignitae.springboot14_mapeorelaciones.entities.ProductoEntity;
import com.dignitae.springboot14_mapeorelaciones.repositories.ClienteRepository;
import com.dignitae.springboot14_mapeorelaciones.repositories.FabricanteRepository;
import com.dignitae.springboot14_mapeorelaciones.repositories.PedidoRepository;
import com.dignitae.springboot14_mapeorelaciones.repositories.ProductoRepository;

@SpringBootApplication
public class Springboot14MapeorelacionesApplication implements CommandLineRunner{

	private ClienteRepository clienteRepository;
	private PedidoRepository pedidoRepository;
	private ProductoRepository productoRepository;
	private FabricanteRepository fabricanteRepository;
	

	public Springboot14MapeorelacionesApplication(
		ClienteRepository clienteRepository, 
		PedidoRepository pedidoRepository,
		FabricanteRepository fabricanteRepository,
		ProductoRepository productoRepository
	){
		this.productoRepository = productoRepository;
		this.clienteRepository = clienteRepository;
		this.fabricanteRepository = fabricanteRepository;
		this.pedidoRepository = pedidoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Springboot14MapeorelacionesApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		//Insertamos 3 clientes
		ClienteEntity cliente1 = new ClienteEntity("Héctor", "Garnacho");
		ClienteEntity cliente2 = new ClienteEntity("Ana", "Coello");
		ClienteEntity cliente3 = new ClienteEntity("Unai", "Monteagudo");		
        this.clienteRepository.save(cliente1);
        this.clienteRepository.save(cliente2);
        this.clienteRepository.save(cliente3);

		//Insertamos 3 pedidos, uno para cada cliente
		PedidoEntity pedido1 = new PedidoEntity(cliente1);
		PedidoEntity pedido2 = new PedidoEntity(cliente2);
		PedidoEntity pedido3 = new PedidoEntity(cliente3);
		
		this.pedidoRepository.save(pedido1);
		this.pedidoRepository.save(pedido2);
		this.pedidoRepository.save(pedido3);		

		//Insertamos 3 fabricantes
		FabricanteEntity fabricante1 = new FabricanteEntity("Fabricante 1");
		FabricanteEntity fabricante2 = new FabricanteEntity("Fabricante 3");
		FabricanteEntity fabricante3 = new FabricanteEntity("Fabricante 3");

		fabricanteRepository.save(fabricante1);
		fabricanteRepository.save(fabricante2);
		fabricanteRepository.save(fabricante3);
		
		//Insertamos 3 productos
		//Creamos los productos, a los que vinculamos los fabricantes antes de persistirlos
		//Es decir, persistimos los productos con sus fabricantes ya vinculados
		ProductoEntity producto1 = new ProductoEntity("Marca p1","Modelo p1", 123);
		ProductoEntity producto2 = new ProductoEntity("Marca p2","Modelo p2", 544);
		ProductoEntity producto3 = new ProductoEntity("Marca p3","Modelo p3", 8972);

		producto1.addFabricante(fabricante1);
		producto1.addFabricante(fabricante2);
		producto1.addFabricante(fabricante3);
		
		producto2.addFabricante(fabricante2);
		
		producto3.addFabricante(fabricante2);
		producto3.addFabricante(fabricante3);
		
		//También podríamos plantearlo al reves, añadiendo productos a un fabricante en vez de fabricantes a un producto
		fabricante3.addProducto(producto3);

		//Persistimos los productos con los fabricantes ya contenidos en los objetos Entity
		this.productoRepository.save(producto1);
		this.productoRepository.save(producto2);
		this.productoRepository.save(producto3);

		//Añadir lineas de pedido a cada pedido con productos
		pedido1.addLineaPedido(producto1,20);
		pedido1.addLineaPedido(producto2,12);
		pedido1.addLineaPedido(producto3,9);
		
		pedido2.addLineaPedido(producto1,100);

		pedido3.addLineaPedido(producto2,1);
		pedido3.addLineaPedido(producto3,55);

		//Persistimos los pedidos a los que hemos añadido lineas de pedido
		pedidoRepository.save(pedido1);
		pedidoRepository.save(pedido2);
		pedidoRepository.save(pedido3);
		
	}

}
