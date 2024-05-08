package com.dignitae.springboot06_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

    @GetMapping("/saludo")
    public String saludar() {
        return "hola-mundo";
    }
    
}