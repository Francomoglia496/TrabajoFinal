package com.labii;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by francomoglia on 11/28/16.
 */
public class EventoSource {

    private static final Map<Integer, Evento> listaEventos = new HashMap<Integer, Evento>();
    private static final AtomicInteger contador = new AtomicInteger(0);
    private static final Map<Integer, Evento> result = new HashMap<Integer, Evento>();

    static {

        Evento evento1 = new Evento(contador.incrementAndGet(), "dormir",new Fecha(28,11,2016,19,51), new Fecha(29,11,2016,4,2),"SopapeameLaPapirola","Red", 1);
        //Evento evento2 = new Evento(contador.incrementAndGet(), "segur durmiendo", 1);
        //Evento evento3 = new Evento(contador.incrementAndGet(), "comer", 2);

        listaEventos.put(evento1.getId(), evento1);
        //listaEventos.put(evento2.getId(), evento2);
        //listaEventos.put(evento3.getId(), evento3);
    }

    public static Collection<Evento> getListaEventos(){
        return listaEventos.values();
    }


}
