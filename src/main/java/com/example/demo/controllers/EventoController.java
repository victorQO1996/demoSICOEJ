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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("eventos")
public class EventoController {

    @Autowired
    @Qualifier("eventoServiceImpl")
    private EventoService eventoService;
    private static final Log log = LogFactory.getLog(EventoController.class);


    @GetMapping("/registroEvento")
    public String redirectEventoForm(Model model, @RequestParam(name = "id", required = false) int id) {
        EventoModel eventoModel = new EventoModel();

        if(id != 0) {
            eventoModel = eventoService.findEventoByIdModel(id);
        }
        model.addAttribute("eventoModel",eventoModel);

        return ViewConstant.RegistroEvento;
    }

    @GetMapping("/add")
    public String Form() {
        return ViewConstant.RegistroEvento;
    }

    @GetMapping("/show")
    public String show() {
        return ViewConstant.Show;
    }

   /* @GetMapping("/calendario")
    public String calendario(Model model) {
        List<EventoModel> lista= eventoService.listAllEventos();
        model.addAttribute("lista",lista);
        return ViewConstant.CALENDARIO;
    }*/


    @PostMapping("/addevento")
    public String addEvento(@ModelAttribute(name = "eventoModel") EventoModel eventoModel, Model model)throws Exception {
        log.info("Method: addEvento() -- Params: " + eventoModel.toString());
        if (eventoService.addEvento(eventoModel) != null)
            model.addAttribute("result", 1);
        else
            model.addAttribute("result", 0);
        return "redirect:/eventos/showEventos";
    }

    @GetMapping("/showEventos")
    public ModelAndView showEventos() {
        ModelAndView mav = new ModelAndView(ViewConstant.RegistroEvento);
        mav.addObject("eventos",eventoService.listAllEventos());
        return mav;
    }

    @GetMapping("/removeEvento")
    public ModelAndView removeEvento(@RequestParam(name = "id",required = true)int id) {
        eventoService.removeEvento(id);
        return showEventos();
    }

}
