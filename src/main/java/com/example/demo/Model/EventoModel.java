package com.example.demo.Model;


import lombok.Data;

import java.io.Serializable;

@Data
public class EventoModel  {



    private Integer id;

    private String NombreEvento;

    private String Fecha;

    private String Horario;

    private String Descripción ;

    private String LugarEvento;

    public EventoModel(Integer id, String nombreEvento, String fecha, String horario, String descripción, String lugarEvento) {
        this.id = id;
        NombreEvento = nombreEvento;
        Fecha = fecha;
        Horario = horario;
        Descripción = descripción;
        LugarEvento = lugarEvento;
    }

    public EventoModel() {

    }

    public int getId() {
        return id;
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


    @Override
    public String toString() {
        return "EventoModel{" +
                "id=" + id +
                ", NombreEvento='" + NombreEvento + '\'' +
                ", Fecha='" + Fecha + '\'' +
                ", Horario='" + Horario + '\'' +
                ", Descripción='" + Descripción + '\'' +
                ", LugarEvento='" + LugarEvento + '\'' +
                '}';
    }
}
