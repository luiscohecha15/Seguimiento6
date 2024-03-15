package ejercicio3;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dao dao = new Dao();
        dao.libros.add(new Libro("Baldor","Aurelio",200));
        dao.alumnos.add(new Alumno("Yajaira","Segundo",18));
        dao.profesor.add(new Profesor("Alberto","Calculo",31));

        dao.getInformacion();

    }
}
