package ejercicio1;
import java.time.*;
import java.time.temporal.*;

public class Empleado {
    private int fechaEmpresaDay, fechaEmpresaMes, fechaEmpresaAnio;
    private double salary;

    public Empleado( int fechaEmpresaDay, int fechaEmpresaMes, int fechaEmpresaAnio, double salary) {
        this.fechaEmpresaDay = fechaEmpresaDay;
        this.fechaEmpresaMes = fechaEmpresaMes;
        this.fechaEmpresaAnio = fechaEmpresaAnio;
        this.salary = salary;
    }

    public int getFechaEmpresaDay() {
        return fechaEmpresaDay;
    }

    public void setFechaEmpresaDay(int fechaEmpresaDay) {
        this.fechaEmpresaDay = fechaEmpresaDay;
    }

    public int getFechaEmpresaMes() {
        return fechaEmpresaMes;
    }

    public void setFechaEmpresaMes(int fechaEmpresaMes) {
        this.fechaEmpresaMes = fechaEmpresaMes;
    }

    public int getFechaEmpresaAnio() {
        return fechaEmpresaAnio;
    }

    public void setFechaEmpresaAnio(int fechaEmpresaAnio) {
        this.fechaEmpresaAnio = fechaEmpresaAnio;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}