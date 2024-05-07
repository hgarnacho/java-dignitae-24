package com.dignitae.springboot03_controladoresparametros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
	//En la llamada: localhost/buscar-provincia?provincia=Valladolid
	@GetMapping("/buscar-provincia")
	@ResponseBody
    public String buscarProvincia(@RequestParam String provincia) {
        // query se obtiene de la cadena de consulta y se pasa como argumento al método
        return "<h1>Buscando por provincia (" + provincia + ")</h1>";
    }

	@RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
    @ResponseBody
	public String obtenerProducto(@PathVariable Long id) {
		// Lógica para obtener el producto con el ID proporcionado
		return "<h1>Vista para el producto " + id + "</h1>";
	}
	
	@RequestMapping(value = "/productos/{categoria}/**", method = RequestMethod.GET)
    @ResponseBody
	public String obtenerProductosPorCategoria(@PathVariable String categoria) {
		// Lógica para obtener todos los productos de una categoría
		return "<h1>Productos de la categoría " + categoria + "</h1>";
	}
	
	@RequestMapping(value = "/usuarios/{nombre:[a-zA-Z]+}", method = RequestMethod.GET)
	public String obtenerUsuario(@PathVariable String nombre) {
		// Lógica para obtener el usuario con el nombre proporcionado
		return "vista-usuario";
	}

	@PostMapping("/crear-usuario")
	@ResponseBody
	public String crearUsuario(@RequestParam String nombre, @RequestParam String email) {
		// Lógica para crear un nuevo usuario con el nombre y el email proporcionados
		return "Crear Usuario con parámetros-> NOMBRE: " + nombre + ", EMAIL: " + email;
	}

}
