package com.example.demo.controllers;

import com.example.demo.Model.EventoModel;
import com.example.demo.constant.ViewConstant;
import com.example.demo.services.EventoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("")
public class EventoController {

    @Autowired
    @Qualifier("eventoServiceImpl")
    private EventoService eventoService;

    private static final Log log = LogFactory.getLog(EventoController.class);

    @GetMapping("/registroEvento")


        public String inicio(){
        return ViewConstant.RegistroEvento;
        }

    @GetMapping("/calendario")
    public String calendario(){
        return "Calendario";
    }


    @PostMapping("/addevento")
    public String addEvento(@ModelAttribute(name = "eventoModel") EventoModel eventoModel, Model model)throws Exception {
        log.info("Method: addEvento() -- Params: " + eventoModel.toString());
        if (eventoService.addEvento(eventoModel) != null)
            model.addAttribute("result", 1);
        else
            model.addAttribute("result", 0);
        return "redirect:/eventos/showEventos";
    }

}
