package ejercicio4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("Motorsport","Medellin, 4 sur",10);

        String[] opciones = {"Vender Carro","Mostrar Info","Agregar Carro","Eliminar Carro","Salir"};
        boolean flag = true;
        do{
            int options = JOptionPane.showOptionDialog(null, "Seleccione una opción:",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (options){
                case 0:
                    if (concesionario.venderCarro()){
                        JOptionPane.showMessageDialog(null,"Carro Vendido");
                    }else {
                        JOptionPane.showMessageDialog(null,"Carro No Vendido");
                    }
                    break;
                case 1:
                    concesionario.getInf();
                    break;
                case 2:
                    concesionario.agregarCarro();
                    break;
                case  3:
                    concesionario.eliminarCarro();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }while (flag);

    }
}
