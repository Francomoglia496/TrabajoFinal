import com.trabajofinal.Calendario;
import com.trabajofinal.Evento;
import com.trabajofinal.Fecha;

/**
 * Created by trabajofinal on 14/11/16.
 */
public class Main {
    public static void main(String [] args){
        escenarioUno();
    }

    public static void escenarioUno(){
        Calendario calendario = new Calendario();
        calendario.agregarEvento(new Evento("Evento1",new Fecha(10,11,2016),new Fecha(16,11,2016),"Corrientes","Descripcion del Evento1"));
        calendario.agregarEvento(new Evento("Evento2",new Fecha(13,11,2016),new Fecha(22,11,2016),"Corrientes","Descripcion del Evento2"));
        calendario.agregarEvento(new Evento("Evento3",new Fecha(2,12,2016),new Fecha(3,12,2016),"Corrientes","Descripcion del Evento3"));
        calendario.agregarEvento(new Evento("Evento4",new Fecha(7,12,2016),new Fecha(11,12,2016),"Resistencia","Descripcion del Evento4"));
        calendario.agregarEvento(new Evento("Evento5",new Fecha(25,12,2016),new Fecha(15,12,2016),"Corrientes","Descripcion del Evento5"));
        calendario.agregarEvento(new Evento("Evento6",new Fecha(31,12,2016),new Fecha(31,12,2016),"Resistencia","Descripcion del Evento6"));
        calendario.agregarEvento(new Evento("Evento7",new Fecha(1,1,2017),new Fecha(1,1,2017),"Corrientes","Descripcion del Evento7"));
        calendario.agregarEvento(new Evento("Evento8",new Fecha(8,1,2017),new Fecha(18,1,2017),"Saenz Peña","Descripcion del Evento8"));

        calendario.listarTodosEventos();
    }
}
