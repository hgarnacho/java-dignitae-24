package com.dignitae.springboot07_mvcthymeleaf.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dignitae.springboot07_mvcthymeleaf.entities.FabricanteEntity;
import com.dignitae.springboot07_mvcthymeleaf.entities.ProductoEntity;
import com.dignitae.springboot07_mvcthymeleaf.repositories.FabricanteRepository;
import com.dignitae.springboot07_mvcthymeleaf.repositories.ProductoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository productoRepository;
    private final FabricanteRepository fabricanteRepository;
    

    public ProductoServiceImpl(ProductoRepository productoRepository, FabricanteRepository fabricanteRepository) {
        this.productoRepository = productoRepository;
        this.fabricanteRepository = fabricanteRepository;
    }


    public void clearProductos() {
        productoRepository.deleteAll();
    }


    public List<ProductoEntity> getProductos() {
        return productoRepository.findAll();
    }


    public List<ProductoEntity> addProductosDemo(int numeroProductos){
        ArrayList<ProductoEntity> productosAdded = new ArrayList<ProductoEntity>();
        for(int i = 1; i<=numeroProductos; i++){           
            ProductoEntity pe= new ProductoEntity(      
                "marca producto " + i, 
                "modelo producto " + i, 
                i*10
            );
            FabricanteEntity fe= fabricanteRepository.save(new FabricanteEntity("Fabricante " + i));
            pe.addFabricante(fe);
            productoRepository.save(pe);
            productosAdded.add(pe);
        }
        return productosAdded;
    }


    @Transactional
    public void increaseStock(int cantidad) {
        List<ProductoEntity> productos = productoRepository.findAll();
        for (ProductoEntity producto : productos) {
            producto.setStock(producto.getStock()+cantidad);
        }
    }


    @Override
    public void addProducto(ProductoEntity pe) {
        this.productoRepository.save(pe);
    }


    @Override
    public ProductoEntity updateProducto(Long id, ProductoEntity pe) {
        ProductoEntity peCurrent = this.productoRepository.findById(id).orElse(null);

        if(null == peCurrent){
            return null;
        }

        peCurrent.setMarca(pe.getMarca());
        peCurrent.setModelo(pe.getModelo());
        peCurrent.setStock(pe.getStock());

        return productoRepository.save(peCurrent);
        
    }


    @Override
    public ProductoEntity findProductoById(Long Id) {
        return productoRepository.findById(Id).orElse(null);        
    }


    @Override
    public void deleteProducto(Long id) {
        productoRepository.deleteById(id);        
    }
    

}
