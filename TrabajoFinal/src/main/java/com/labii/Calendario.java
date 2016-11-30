package com.labii;

import java.util.ArrayList;

/**
 * Created by francomoglia on 11/28/16.
 */


public class Calendario {

    private int idCalendario = 0;
    private String nombre;
    private Usuario usuario;
    private ArrayList<Evento> evento = new ArrayList<Evento>();

    public Calendario(int idCalendario, String nombre, int idUsuario) {
        this.idCalendario = idCalendario;
        this.nombre = nombre;
        this.usuario = UsuarioSource.getUsuario(idUsuario);
        //this.evento = CalendarioSource.obtenerEventos(id);
        //this.evento.addAll(EventoSource.getListaEventos());
        for (Evento a : EventoSource.getListaEventos()){
            evento.add(a);
        }



    }

    public Calendario (int idCalendario, String nombre, Usuario usuario){
        this.idCalendario = idCalendario;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public int getIdCalendario() {
        return idCalendario;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ArrayList<Evento> getEvento() {
        return evento;
    }
}
