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

    @Autowired
    @Qualifier("lugarServiceImpl")


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

        evento.setId(eventoModel.getId());
        evento.setNombreEvento(eventoModel.getNombreEvento());
        evento.setFecha(fechf);
        evento.setHorario(eventoModel.getHorario());
        evento.setDescripción(eventoModel.getDescripción());
        evento.setLugarEvento(eventoModel.getLugarEvento());

    EventoModel eventoModel = new EventoModel();

    eventoModel.setId(evento.getId());
    eventoModel.setNombreEvento(evento.getNombreEvento());
    eventoModel.setNombre(evento.getNombre());
    eventoModel.setFechaF(new SimpleDateFormat("yyyy-MM-dd hh:mm").format(evento.getFechaF()));
    eventoModel.setFechaI(new SimpleDateFormat("yyyy-MM-dd hh:mm").format(evento.getFechaI()));
    eventoModel.setLugar_id(evento.getLugar().getId());
    eventoModel.setLugar_nombre(evento.getLugar().getNombre());
    if(evento.getAsistentes() != null) {
        for (Asistente asistente : evento.getAsistentes()) {
            asistenteNames.add(asistente.getNombre() + " " + asistente.getApellido());
        }
    }
    eventoModel.setAsistentes(asistenteNames);

    return eventoModel;
    }
}
