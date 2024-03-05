package ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class PersonaDAO {
    private ArrayList<Persona> personas;

    public PersonaDAO() {
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    void save(Persona persona){
        personas.add(persona);
    }
    void imprimirDatos(){
        System.out.println(getPersonas().toString());
    }
    public void getEdad(){
        LocalDate fNacimiento = LocalDate.of(personas.getFirst().getDay(), personas.getFirst().getMonth(),personas.getFirst().getYear());
        System.out.println("Tu edad es de " + ChronoUnit.YEARS.between(fNacimiento, LocalDate.now()) + " años.");
    }
}
