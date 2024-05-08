package com.dignitae.springboot07_mvcthymeleaf.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.dignitae.springboot07_mvcthymeleaf.entities.ProductoEntity;
import com.dignitae.springboot07_mvcthymeleaf.services.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductoController {

    private ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping("/")
    public String inicio() {
        return "redirect:/productos";
    }

	@GetMapping("/productos")
    public String listarProductos(Model model) {

        //Obtenemos los productos
        List<ProductoEntity> productosLista = productoService.getProductos();
        
        //Añadimos el listado de productos al modelo
        model.addAttribute("productosList", productosLista);
        model.addAttribute("productosCount", productosLista.size());
        
        //Renderizamos la vista listado-productos, con el modelo
        return "listado-productos";
    }


	@GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        
        //Añadimos un objeto Producto en blanco, que será rellenado en el formulario
        model.addAttribute("producto", new ProductoEntity());
        //El action podría ser perfectamente una constante, pero se lo añadimos también al modelo
        model.addAttribute("action", "/productos/nuevo");

        //Renderizamos la vista nuevo-producto, con el modelo
        return "formulario-nuevo-producto";
    }


    @PostMapping("productos/nuevo")
    public String guardarNuevoProducto(@ModelAttribute ProductoEntity pe) {
        
       this.productoService.addProducto(pe);
       return "redirect:/productos";
        
    }


    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {

        ProductoEntity pe = productoService.findProductoById(id);        
        
        //Añadimos un objeto Producto en blanco, que será rellenado en el formulario
        model.addAttribute("producto", pe);
        //El action podría ser perfectamente una constante, pero se lo añadimos también al modelo
        model.addAttribute("action", "/productos/editar/" + id);

        //Renderizamos la vista nuevo-producto, con el modelo
        return "formulario-editar-producto";
    }

    @PostMapping("productos/editar/{id}")  
    public String actualizarProducto(@PathVariable Long id, @ModelAttribute ProductoEntity pe){

        this.productoService.updateProducto(id, pe);
        return "redirect:/productos";

    }
    
    @GetMapping("/eliminar/{id}")  
    public String eliminarProducto(@PathVariable Long id){

        this.productoService.deleteProducto(id);
        return "redirect:/productos";

    }

}
