package com.example.demo.services;

import com.example.demo.entity.Ejidatario;
import java.util.List;

public interface EjidatarioService {

    public abstract List<Ejidatario> listaEjidatarios();

    public abstract Ejidatario addEjidatario(Ejidatario ejidatario);
}
