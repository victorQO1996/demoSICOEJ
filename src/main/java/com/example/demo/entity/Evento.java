package com.example.demo.entity;

import lombok.Data;
import lombok.Generated;


import javax.persistence.*;

import java.util.Date;
@Data
@Entity
@Table(name="prueba2")
public class Evento {

    @Id
    @Generated
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "NombreEvento")
    private String NombreEvento;
    @Column(name = "Fecha")
    private String Fecha;
    @Column(name = "Horario")
    private String Horario;
    @Column(name = "Descripción")
    private String Descripción ;
    @Column(name = "LugarEvento")
    private String LugarEvento;



    public Evento(String nombreEvento, String fecha, String horario, String descripción, String lugarEvento) {
        NombreEvento = nombreEvento;
        Fecha = fecha;
        Horario = horario;
        Descripción = descripción;
        LugarEvento = lugarEvento;
    }

    public Evento(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEvento() {
        return NombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        NombreEvento = nombreEvento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public String getLugarEvento() {
        return LugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        LugarEvento = lugarEvento;
    }
}
