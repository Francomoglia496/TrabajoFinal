package com.labii;

/**
 * Created by francomoglia on 11/28/16.
 */
public class Evento {

    private int id;
    private String nombre;
    private Calendario calendario;
    private Fecha fechaInicio;
    private Fecha fechaFin;
    private String descripcion;
    private String color;


    public Evento(int id, String nombre, Fecha fechaInicio, Fecha fechaFin, String descripcion, String color, int idCalendario) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.color = color;
        this.calendario = CalendarioSource.getCalendario(idCalendario);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public Fecha getFechaFin() {
        return fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getColor() {
        return color;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "idEvento=" + id +
                ", nombre1434234='" + nombre + '\'' +
                ", calendario=" + calendario +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", descripcion='" + descripcion + '\'' +
                ", colorsdsdf='" + color + '\'' +
                '}';
    }
}
