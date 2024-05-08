package com.dignitae.springboot10_servicios.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dignitae.springboot10_servicios.entities.Producto;
import com.dignitae.springboot10_servicios.repositories.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void clearProductos() {
        productoRepository.deleteAll();
    }

    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    public void addProductosDemo(int numeroProductos){
        for(int i = 1; i<=numeroProductos; i++){
            Producto producto= new Producto(
                0L,
                "marca producto " + i, 
                "modelo producto " + i, 
                i
            );
            productoRepository.save(producto);
        }
    }

    @Transactional
    public void increaseStock(int cantidad) {
        List<Producto> productos = productoRepository.findAll();
        for (Producto producto : productos) {
            producto.setStock(producto.getStock()+cantidad);
        }
    }

}
