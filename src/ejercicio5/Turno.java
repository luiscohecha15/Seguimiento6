package ejercicio5;
import java.time.*;
import java.time.LocalDate.*;
public class Turno {

    private String descripcion;

    public Turno(String descripcion) {
        this.descripcion = descripcion;
    }

    public Turno() {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHoraInicio(){
        return ("Hora inicio del turno: "+ LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+
                "\nHora final turno: "+LocalDateTime.now().plusHours(1).getHour()+":"+LocalDateTime.now().getMinute()+"\nDescripcion: "+
                this.getDescripcion());
    }
}
