package com.example.demo.controllers;

import com.example.demo.constant.ViewConstant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("")
public class EventoController {

    @GetMapping("/registroEvento")


        public String inicio(){ return ViewConstant.RegistroEvento; }


}
