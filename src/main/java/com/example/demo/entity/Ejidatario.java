package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@Entity
@Table(name="documentoayp")
public class Ejidatario {
    @Id
    @GeneratedValue
    @Column(name = "IDA")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fechaN")
    private String fechaN;

    @Column(name = "email")
    private String email;

    @Column(name = "curpbusqueda")
    private String curpbusqueda;

    public Ejidatario(String nombre, String fechaN, String email, String curpbusqueda) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.email = email;
        this.curpbusqueda = curpbusqueda;
    }

    public Ejidatario() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurpbusqueda() {
        return curpbusqueda;
    }

    public void setCurpbusqueda(String curpbusqueda) {
        this.curpbusqueda = curpbusqueda;
    }
}
