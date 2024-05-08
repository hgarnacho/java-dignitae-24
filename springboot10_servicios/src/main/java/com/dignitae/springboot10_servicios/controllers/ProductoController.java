package com.dignitae.springboot10_servicios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dignitae.springboot10_servicios.entities.Producto;
import com.dignitae.springboot10_servicios.services.ProductoService;

import java.util.List;

@Controller
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("productos")
    public String productos(Model model) {
    
        productoService.clearProductos();
        productoService.addProductosDemo(50);
        productoService.increaseStock(100);
                
        List<Producto> listProductos = productoService.getProductos();
      
        model.addAttribute("modelProductos", listProductos);
        return "listado-productos"; 
        
    }

}