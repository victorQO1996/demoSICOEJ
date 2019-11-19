package com.example.demo.services.Impl;

import com.example.demo.entity.Ejidatario;
import com.example.demo.repository.EjidatarioRepository;
import com.example.demo.services.EjidatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("EjidatarioService")
public class EjidatarioServiceImpl implements EjidatarioService {

    @Autowired
    @Qualifier("EjidatarioRepository")

    private EjidatarioRepository ejidatarioRepository;


    @Override
    public List<Ejidatario> listaEjidatarios() {
        return ejidatarioRepository.findAll();
    }

    @Override
    public Ejidatario addEjidatario(Ejidatario ejidatario) {
        return ejidatarioRepository.save(ejidatario );
    }
}
