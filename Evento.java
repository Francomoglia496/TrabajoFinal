package com.trabajofinal;

/**
 * Created by francomoglia on 11/15/16.
 */
public class Evento {

    //      ATRIBUTOS
    private Fecha fechaInicio;
    private Fecha fechaFinal;
    private String lugar;
    private String descripcionDelEvento;
    private String nombre;


    /**
     * Constructor de la clase Evento
     * @param fechaInicio
     * @param fechaFinal
     * @param lugar
     * @param descripcionDelEvento
     */
    public Evento(String nombre, Fecha fechaInicio, Fecha fechaFinal, String lugar, String descripcionDelEvento) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.lugar = lugar;
        this.descripcionDelEvento = descripcionDelEvento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ evento : "+this.nombre+", fechaInicio : "+ this.fechaInicio+", ");
        sb.append("fechaFinal : "+this.fechaFinal+", lugar : "+this.lugar+", ");
        sb.append("descripcion : "+this.descripcionDelEvento+" }");
        return sb.toString();
    }
}

