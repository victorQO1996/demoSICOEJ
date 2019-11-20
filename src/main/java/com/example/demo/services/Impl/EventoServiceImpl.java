package com.example.demo.services.Impl;


import com.example.demo.Components.EventoConverter;
import com.example.demo.Model.EventoModel;
import com.example.demo.entity.Evento;
import com.example.demo.repository.EventoRepository;
import com.example.demo.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("eventoServiceImpl")

public class EventoServiceImpl implements EventoService {

    @Autowired
    @Qualifier("eventoRepository")
    private EventoRepository eventoRepository;

    @Autowired
    @Qualifier("eventoConverter")
    private EventoConverter eventoConverter;
/*
    @Autowired
    @Qualifier("asistenteRepository")
    private AsistenteRepository asistenteRepository;*/



    @Override
    public EventoModel addEvento(EventoModel eventoModel) throws Exception {
        //Aquí nos pide una entidad, por lo tanto tenemos que transformar el eventoModel a entidad
        Evento temp=eventoConverter.convertEventoModel2Evento(eventoModel);
        Evento evento = eventoRepository.save(temp);
        return eventoConverter.convertEvento2EventoModel(evento);
    }


    @Override
    public List<EventoModel> listAllEventos() {
        List<Evento> eventos = eventoRepository.findAll();
        List<EventoModel> eventosModel = new ArrayList();
        for(Evento evento : eventos){
            eventosModel.add(eventoConverter.convertEvento2EventoModel(evento));

        }
        return eventosModel;
    }

    @Override
    public Evento findEventoById(int id) {
        return eventoRepository.findById(id);
    }

    public EventoModel findEventoByIdModel(int id){
        return eventoConverter.convertEvento2EventoModel(findEventoById(id));
    }

    @Override
    public Evento convertEventoModel2Evento(EventoModel eventoModel) throws Exception {
        return eventoConverter.convertEventoModel2Evento(eventoModel);
    }

    @Override
    public EventoModel convertEvento2EventoModel(Evento evento) {
        return eventoConverter.convertEvento2EventoModel(evento);
    }

    @Override
    public void removeEvento(int id) {
        Evento evento  = findEventoById(id);
        if(evento != null){
            eventoRepository.delete(findEventoById(id));
        }
    }
}