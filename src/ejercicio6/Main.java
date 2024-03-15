package ejercicio6;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        libros.add(new Libro("Luis","Mi vida",20000));
        peliculas.add(new Pelicula("Tron","Luis","Cohecha",10000));
        TiendaDao dao = new TiendaDao();

        boolean flag = true;
        String[] opciones = {"Ver Peliculas", "Ver Libros", "Agregar Pelicula","Agregar Libro","Comprar pelicula","Comprar libro","Ventas info","Salir"};
        do{
            int options = JOptionPane.showOptionDialog(null, "Seleccione una opción:",
                    "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (options){
                case 0:
                    for (Pelicula pelicula : peliculas){
                        System.out.println("Nombre: "+pelicula.getTitulo()+"\nDirector: "+pelicula.getDirector()
                                +"\nProtagonista: "+ pelicula.getProtagonista() +"\nPrecio: "+ pelicula.getPrecio());
                        System.out.println("------------------------");
                    }
                    break;
                case 1:
                    for (Libro libro : libros){
                        System.out.println("Nombre: "+libro.getTitulo()+"\nAutor: "+libro.getAutor()
                                +"\nPrecio: "+ libro.getPrecio());
                        System.out.println("------------------------");
                    }
                    break;
                case 2:
                    peliculas.add(new Pelicula(JOptionPane.showInputDialog(null,"Ingrese el nombre de la pelicula"),
                            JOptionPane.showInputDialog(null,"Nombre del protagonista"),
                            JOptionPane.showInputDialog(null,"Nombre del director"),(Float.parseFloat(
                                    JOptionPane.showInputDialog(null,"Ingrese el precio")))));
                    break;
                case 3:
                    libros.add(new Libro(JOptionPane.showInputDialog(null,"Nombre del autor"),JOptionPane.showInputDialog(null,"" +
                            "Nombre del libro"),Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el precio del libro"))));
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }while (flag);




    }
}
