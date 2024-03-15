package ejercicio3;

public class Profesor {
    private String nombre,materia;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Profesor(String nombre, String materia, int edad) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;

    }

}
