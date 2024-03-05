package ejercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Baldor","Aurelio",200);

        Alumno alumno = new Alumno("Yajaira","Segundo",18);

        JOptionPane.showMessageDialog(null,"ALUMNO\n"+alumno.getInfo()+"\n\nLIBRO\n"+libro.getInf());
    }
}
