package com.example.demo.controllers;

import com.example.demo.entity.Ejidatario;
import com.example.demo.services.EjidatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejidatario")

public class ComisariadoController {

    @Autowired
    @Qualifier("EjidatarioService")
    private EjidatarioService ejidatarioService;
    @GetMapping("/list")
    public ModelAndView listaEjidatarios(){
        ModelAndView map = new ModelAndView("list");
        map.addObject("ejidatarios", ejidatarioService.listaEjidatarios());
        map.addObject("ejidatario",new Ejidatario());
        return map;
    }

    @PostMapping("/addEjidatario")
    public String addEjidatario(@ModelAttribute(name = "ejidatarios") Ejidatario ejidatario){

        ejidatarioService.addEjidatario(ejidatario);
        return "rediret:/ejidatario/list";
    }
}

