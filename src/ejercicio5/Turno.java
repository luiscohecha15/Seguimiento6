package ejercicio5;
import javax.swing.*;
import java.time.*;
import java.time.LocalDate.*;
public class Turno {
    LocalDateTime Hora = LocalDateTime.now();
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

    public void getHoraInicio(){
        JOptionPane.showMessageDialog(null, "Hora inicio del turno: "+ Hora.getHour()+":"+Hora.getMinute()+
                "\nHora final turno: "+Hora.now().plusHours(1).getHour()+":"+Hora.now().getMinute()+"\nDescripcion: "+
                this.getDescripcion());
    }
}
