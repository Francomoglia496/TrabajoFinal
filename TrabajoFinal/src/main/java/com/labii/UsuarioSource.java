package com.labii;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by francomoglia on 11/28/16.
 */
public class UsuarioSource {

    private static final Map<Integer, Usuario> listUsuarios = new HashMap<Integer, Usuario>();

    private static final AtomicInteger count = new AtomicInteger(0);

    static {

        Usuario usuario1 = new Usuario(count.incrementAndGet(), "juan", "yahoo");
        Usuario usuario2 = new Usuario(count.incrementAndGet(), "lola", "gmail");

        listUsuarios.put(usuario1.getId(), usuario1);
        listUsuarios.put(usuario2.getId(), usuario2);
    };

    public static Usuario getUsuario(int idusuario){

        if (listUsuarios.get(idusuario) != null){
            return listUsuarios.get(idusuario);
        }else throw new CustomExceptionUsuario("Usuario Inexistente");

    }

    public static Map<Integer,Usuario> getUsuarios(){

        if (!listUsuarios.values().isEmpty()){
            return listUsuarios;
        }else throw new CustomExceptionUsuario("Coleccion vacia");

    }

    //  ALTA
    public static void altaUsuario(String nombre, String email){

        Usuario aux = new Usuario(52, nombre, email);

        listUsuarios.put(aux.getId(), aux);

    }

    // BAJA
    public static void bajaUsuario(int idUsuario){

        listUsuarios.remove(idUsuario);

    }

    //  MODIFICACION
    public static void modifUsuario(int idUsuario, String email){

        if (listUsuarios.get(idUsuario) != null) {
            listUsuarios.get(idUsuario).setEmail(email);
        }else throw new CustomExceptionUsuario("Usuario no encontrado");

    }
}
