package com.example.demo.Components;


import com.example.demo.Model.EventoModel;
import com.example.demo.entity.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component("eventoConverter")

public class EventoConverter {

   /* @Autowired
    @Qualifier("lugarServiceImpl")*/


    public Evento convertEventoModel2Evento(EventoModel eventoModel)throws Exception {
        String[] fecha = eventoModel.getFecha().split("T");
        Date fechf = new SimpleDateFormat("dd-MM-yyyy").parse(fecha[0] + " " + fecha[1]);

        Evento evento = new Evento();
        evento.setId(eventoModel.getId());
        evento.setNombreEvento(eventoModel.getNombreEvento());
        evento.setFecha(fechf);
        evento.setHorario(eventoModel.getHorario());
        evento.setDescripción(eventoModel.getDescripción());
        evento.setLugarEvento(eventoModel.getLugarEvento());



        return evento;
    }

    public EventoModel convertEvento2EventoModel(Evento evento) {

    EventoModel eventoModel = new EventoModel();

    eventoModel.setId(evento.getId());
    eventoModel.setNombreEvento(evento.getNombreEvento());
    eventoModel.setFecha(new SimpleDateFormat("dd-MM-yyyy").format(evento.getFecha()));
    eventoModel.setHorario(evento.getHorario());
    eventoModel.setDescripción(evento.getDescripción());
    eventoModel.setLugarEvento(evento.getLugarEvento());



    return eventoModel;
    }
}
