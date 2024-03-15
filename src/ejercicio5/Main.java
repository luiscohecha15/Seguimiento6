package ejercicio5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Turno turno = new Turno(JOptionPane.showInputDialog(null,"Agregue una descripcion"));
        turno.getHoraInicio();
    }
}