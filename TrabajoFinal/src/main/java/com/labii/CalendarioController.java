package com.labii;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Scanner;

import static com.labii.CalendarioSource.obtenerEventos;

/**
 * Created by francomoglia on 11/28/16.
 */
@RestController (value = "/calendario")
public class CalendarioController {

    @RequestMapping(method = RequestMethod.GET)
    public Collection getCalendario(){
        System.out.println(CalendarioSource.obtenerEventos(1));
        return CalendarioSource.getListaCalendarios();
    }

}
