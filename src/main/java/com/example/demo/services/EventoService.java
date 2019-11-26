package com.example.demo.services;



import com.example.demo.Model.EventoModel;
import com.example.demo.entity.Evento;

import java.util.List;

public interface EventoService{


    public abstract EventoModel addEvento(EventoModel eventoModel) throws Exception;

    public abstract List<EventoModel> listAllEventos();

    public abstract Evento findEventoById(int id);

    public abstract void removeEvento(int id);

    public abstract EventoModel findEventoByIdModel(int id);

    public abstract Evento convertEventoModel2Evento(EventoModel eventoModel) throws Exception;

    public abstract EventoModel convertEvento2EventoModel(Evento evento);

}
