package com.example.demo.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name="evento")
public class Evento {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "NombreEvento")
    private String NombreEvento;
    @Column(name = "Fecha")
    private Date Fecha;
    @Column(name = "Horario")
    private String Horario;
    @Column(name = "Descripción")
    private String Descripción ;
    @Column(name = "LugarEvento")
    private String LugarEvento;


    //@ToString.Exclude
    //@ManyToMany(mappedBy = "eventos")
    //private List<Asistente> asistentes;

    //@ManyToOne
    //@JoinColumn
    //private Lugar lugar;


    public Evento(String nombreEvento, Date fecha, String horario, String descripción, String lugarEvento) {
        NombreEvento = nombreEvento;
        Fecha = fecha;
        Horario = horario;
        Descripción = descripción;
        LugarEvento = lugarEvento;
    }

    public Evento(){

    }
}
