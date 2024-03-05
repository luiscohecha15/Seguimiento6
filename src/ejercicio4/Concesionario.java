package ejercicio4;

import javax.swing.*;

public class Concesionario {
    private String nombre, direccion;
    private int cantidadCarros;

    public Concesionario(String nombre, String direccion, int cantidadCarros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadCarros = cantidadCarros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadCarros() {
        return cantidadCarros;
    }

    public void setCantidadCarros(int cantidadCarros) {
        this.cantidadCarros = cantidadCarros;
    }

    public void agregarCarro(){
        this.cantidadCarros++;
        System.out.println("Carro agregado con Exito!");
    }

    public void eliminarCarro(){
        if (this.cantidadCarros > 0){
            this.cantidadCarros--;
            System.out.println("Carro eliminado con Exito!");
        }else{
            JOptionPane.showMessageDialog(null, "No hay carros que eliminar");
        }
    }

    public void getInf(){
        JOptionPane.showMessageDialog(null,"Nombre: "+getNombre()+"\nDireccion: "+getDireccion()+
                "\nCarros Disponibles: "+getCantidadCarros(),"Informacion del concesionario",1,null);
    }
    public boolean venderCarro(){
        if (this.cantidadCarros > 0){
            this.cantidadCarros--;
            return true;
        }
        return false;
    }
}
