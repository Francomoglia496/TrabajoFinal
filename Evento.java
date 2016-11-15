package TrabajoFinal;

/**
 * Created by francomoglia on 11/15/16.
 */
public class Evento {

    //      ATRIBUTOS
    private Fecha fechaInicio;
    private Fecha fechaFinal;
    private String lugar;
    private String descripcionDelEvento;


    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Fecha fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Fecha getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Fecha fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcionDelEvento() {
        return descripcionDelEvento;
    }

    public void setDescripcionDelEvento(String descripcionDelEvento) {
        this.descripcionDelEvento = descripcionDelEvento;
    }

    public Evento(Fecha fechaInicio, Fecha fechaFinal, String lugar, String descripcionDelEvento) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.lugar = lugar;
        this.descripcionDelEvento = descripcionDelEvento;
    }

    @Override
    public String toString() {
        return "\t EVENTO: \n" +
                "Inicio:\n " + fechaInicio + "\n" +
                "Final:\n " + fechaFinal + "\n" +
                "Lugar: " + lugar + "\n" +
                "Descripcion: " + descripcionDelEvento;
    }
}

