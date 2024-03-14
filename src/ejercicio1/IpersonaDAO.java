package ejercicio1;

public interface IpersonaDAO {
    void save(Persona persona);
    void imprimirDatos();
    void getEdad();
}

abstract class PersonaDaoo implements IpersonaDAO{

}
