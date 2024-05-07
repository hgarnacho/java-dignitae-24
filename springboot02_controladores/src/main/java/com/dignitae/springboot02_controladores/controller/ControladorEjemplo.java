package com.dignitae.springboot02_controladores.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class ControladorEjemplo {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "<h1>Home de la aplicación web</h1>";
    }

    @RequestMapping("/holamundo")
    @ResponseBody
    public String holaMundo(){
        return "<h1 style='color:green'>Hola Mundo</h1>";
    }

    @RequestMapping("/plantilla")
    public String template(){
        return "plantilla";
    }




}
