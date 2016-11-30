package com.labii;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by francomoglia on 11/28/16.
 */
public class CalendarioSource {

    private static final Map<Integer, Calendario> listaCalendarios = new HashMap<Integer, Calendario>();
    private static final AtomicInteger contador = new AtomicInteger(0);

    static{

        Calendario calendario1 = new Calendario(contador.incrementAndGet(), "facultad", 1);

        listaCalendarios.put(calendario1.getIdCalendario(), calendario1);

    };

    public static Collection<Calendario> getListaCalendarios() {
        return listaCalendarios.values();
    }

    public static Calendario getCalendario (Integer idCalendario) {
        return listaCalendarios.get(idCalendario);
    }

    public static ArrayList<Evento> obtenerEventos (int idCalendario){

        Calendario aux = listaCalendarios.get(idCalendario);

        return aux.getEvento();

    }
}
