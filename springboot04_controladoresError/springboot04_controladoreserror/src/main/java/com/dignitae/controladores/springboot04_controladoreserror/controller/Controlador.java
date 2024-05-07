package com.dignitae.controladores.springboot04_controladoreserror.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class Controlador {

	@GetMapping
	@ResponseBody
	public String index() {
		return "<h1>Home de la aplicación Web.</h1>";
	}
	
	@GetMapping("/holamundo")
	@ResponseBody
	public String holaMundo() {
		return "<h1 style='color:red;'>Hola Mundo!!!</h1>";
	}

}


