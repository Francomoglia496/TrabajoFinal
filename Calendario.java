package com.trabajofinal;

import java.util.LinkedList;

/**
 * Created by francomoglia on 11/15/16.
 */
public class Calendario {

    //      ATRIBUTOS
    private LinkedList<Evento> calendar = new LinkedList<Evento>();

    public LinkedList<Evento> getCalendar() {
        return calendar;
    }

    /*public void setCalendar(LinkedList<Evento> calendar) {
        this.calendar = calendar;
    }*/

    /**
     * Agrega un evento al calendario.
     * @param evento
     */
    public void agregarEvento(Evento evento){
        calendar.add(evento);
    }

    /**
     * Elimina un evento del calendario.
     * @param evento
     */
    public void quitarEvento(Evento evento){
        calendar.remove(evento);
    }

    /**
     * Muestra todos los eventos cargados en el calendario.
     */
    public void listarTodosEventos(){
        for (Evento evtos: this.calendar) {
            System.out.println(evtos);
        }
    }

    /*public void setDesripionEvento(Evento evento){
        calendar.get(calendar.indexOf(evento)).setDescripcionDelEvento(sc.nextLine());
    }*/

    /*public void setLugarEvento (Evento evento){
        calendar.get(calendar.indexOf(evento)).setLugar(sc.nextLine());
    }*/

    //      PULIRLO
    /*public void crearEvento (){

        Evento evento = new Evento("Cosa del demonio",new Fecha(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()), new Fecha(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.nextLine(),sc.nextLine());

        calendar.add(evento);

    }*/
    //FALTA PODER MODIFICAR HORA, MINUTOS, DIA, MES, AÑO TODOS POR SEPARADO
}
