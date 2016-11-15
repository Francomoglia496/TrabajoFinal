package TrabajoFinal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by francomoglia on 11/15/16.
 */
public class Calendario {

    //      ATRIBUTOS
    private LinkedList<Evento> calendar = new LinkedList<Evento>();

    Scanner sc = new Scanner(System.in);

    public LinkedList<Evento> getCalendar() {
        return calendar;
    }

    public void setCalendar(LinkedList<Evento> calendar) {
        this.calendar = calendar;
    }

    public void agregarEvento(Evento evento){
        calendar.add(evento);
    }

    public void quitarEvento(Evento evento){
        calendar.remove(evento);
    }

    public void setDesripionEvento(Evento evento){
        calendar.get(calendar.indexOf(evento)).setDescripcionDelEvento(sc.nextLine());
    }

    public void setFechaInicioEvento (Evento evento){
        calendar.get(calendar.indexOf(evento)).setFechaInicio(new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    public void setFechaFinalEvento (Evento evento){
        calendar.get(calendar.indexOf(evento)).setFechaFinal(new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    public void setLugarEvento (Evento evento){
        calendar.get(calendar.indexOf(evento)).setLugar(sc.nextLine());
    }

    //      PULIRLO
    public void crearEvento (){

        Evento evento = new Evento(new Fecha(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()), new Fecha(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.nextLine(),sc.nextLine());

        calendar.add(evento);

    }
    //FALTA PODER MODIFICAR HORA, MINUTOS, DIA, MES, AÑO TODOS POR SEPARADO
}
