package ejercicio3;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        libros.add(new Libro("Baldor","Aurelio",200));

        Alumno alumno = new Alumno("Yajaira","Segundo",18);

        JOptionPane.showMessageDialog(null,"ALUMNO\n"+alumno.getInfo()+"\n\nLIBRO\n"+libro.getInf());
    }
}
