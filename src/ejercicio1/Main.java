package ejercicio1;
import javax.swing.*;
import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonaDAO dao = new PersonaDAO();


        Empleado empleado = new Empleado(Integer.parseInt(JOptionPane.showInputDialog(null,"Dia de ingreso a la empresa")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Mes de ingreso a la empresa")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Año de ingreso a la empresa")),
                Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el salario basico")));

        Persona persona = new Persona(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su cedula"))
                ,JOptionPane.showInputDialog(null,"Ingrese nombre"),
                JOptionPane.showInputDialog(null,"Ingrese apellido"),
                JOptionPane.showInputDialog(null,"Ingrese el genero"),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Dia de nacimiento")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Mes de nacimiento")),
                Integer.parseInt(JOptionPane.showInputDialog(null,"Año de nacimiento")),empleado);
        dao.save(persona);

        dao.imprimirDatos();
        dao.getEdad();


    }
}
