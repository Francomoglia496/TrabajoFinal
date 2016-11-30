package com.labii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by francomoglia on 11/28/16.
 */
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String email;
    private Map<Integer, Calendario> calendarios = new HashMap<Integer, Calendario>();

    public Usuario(int id, String nombre, String email) {
        this.idUsuario = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<Integer, Calendario> getCalendarios() {
        return calendarios;
    }
}
