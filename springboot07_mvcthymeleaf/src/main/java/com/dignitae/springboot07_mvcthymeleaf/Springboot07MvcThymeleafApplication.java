package com.dignitae.springboot07_mvcthymeleaf;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dignitae.springboot07_mvcthymeleaf.entities.ClienteEntity;
import com.dignitae.springboot07_mvcthymeleaf.entities.FabricanteEntity;
import com.dignitae.springboot07_mvcthymeleaf.entities.PedidoEntity;
import com.dignitae.springboot07_mvcthymeleaf.entities.ProductoEntity;
import com.dignitae.springboot07_mvcthymeleaf.repositories.ClienteRepository;
import com.dignitae.springboot07_mvcthymeleaf.repositories.FabricanteRepository;
import com.dignitae.springboot07_mvcthymeleaf.repositories.PedidoRepository;
import com.dignitae.springboot07_mvcthymeleaf.repositories.ProductoRepository;
import com.dignitae.springboot07_mvcthymeleaf.services.ProductoService;

@SpringBootApplication
public class Springboot07MvcThymeleafApplication implements CommandLineRunner {

	private ClienteRepository clienteRepository;
	private PedidoRepository pedidoRepository;
	private ProductoRepository productoRepository;
	private FabricanteRepository fabricanteRepository;
	private ProductoService productoService;
	
	public Springboot07MvcThymeleafApplication(
		ClienteRepository clienteRepository, 
		PedidoRepository pedidoRepository,
		FabricanteRepository fabricanteRepository,
		ProductoRepository productoRepository,
		ProductoService productoService
	){
		this.productoRepository = productoRepository;
		this.clienteRepository = clienteRepository;
		this.fabricanteRepository = fabricanteRepository;
		this.pedidoRepository = pedidoRepository;
		this.productoService = productoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Springboot07MvcThymeleafApplication.class, args);
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
	
		//Insertamos productos con 1 fabricante para cada uno
		List<ProductoEntity> productosAdded = this.productoService.addProductosDemo(20);
	}

}
