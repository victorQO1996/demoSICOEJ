package com.example.demo.repository;

import com.example.demo.entity.Ejidatario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("EjidatarioRepository")
public interface EjidatarioRepository extends JpaRepository<Ejidatario, Serializable> {

}
