package com.trabajofinal;

import java.util.Date;

/**
 * Created by francomoglia on 11/15/16.
 */
public class Fecha {

    //      ATRIBUTOS
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minutos;


    /**
     * Constructor de la clase Fecha
     * @param dia
     * @param mes
     * @param anio
     * @param hora
     * @param minutos
     */
    public Fecha(int dia, int mes, int anio, int hora, int minutos){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.minutos = minutos;

        /*if (dia > 0 && dia < 31) {
            this.dia = dia;
        }else {
            throw new IllegalArgumentException("Dia Invalido");
        }

        if (mes > 0 && mes < 12) {
            this.mes = mes;
        }else {
            throw new IllegalArgumentException("Mes Invalido");
        }

        if (anio > 0) {
            this.anio = anio;
        }else {
            throw new IllegalArgumentException("Año Invalido");
        }

        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }else {
            throw new IllegalArgumentException("Hora Invalida");
        }

        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }else {
            throw new IllegalArgumentException("Minutos Invalidos");
        }*/
    }

    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = 0;
        this.minutos = 0;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.dia < 10){
            sb.append("0"+this.dia);
        } else {
            sb.append(this.dia);
        }
        if (this.mes < 10){
            sb.append("/0"+this.mes);
        } else {
            sb.append("/"+this.mes);
        }
        if (this.hora < 10){
            sb.append("/"+this.anio+" 0"+this.hora);
        } else {
            sb.append("/"+this.anio+" "+this.hora);
        }
        if (this.minutos < 10){
            sb.append(":0"+this.hora);
        } else {
            sb.append(":"+this.hora);
        }
        return sb.toString();
    }
}

