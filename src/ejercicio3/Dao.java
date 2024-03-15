package ejercicio3;

import javax.swing.*;
import java.util.ArrayList;

public class Dao extends persona {


    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Alumno> alumnos = new ArrayList<>();
    ArrayList<Profesor> profesor = new ArrayList<>();



    @Override
    public void getInformacion() {
        for(Libro libro : libros){
            JOptionPane.showMessageDialog(null, "Nombre del libro:"+libro.getTitulo());
        }

        for(Alumno alumnos : alumnos){
            JOptionPane.showMessageDialog(null, "Nombre del alumno:"+alumnos.getNombre());
        }

        for(Profesor profesores : profesor){
            JOptionPane.showMessageDialog(null, "Nombre del profesor:"+profesores.getNombre());
        }


    }
}

