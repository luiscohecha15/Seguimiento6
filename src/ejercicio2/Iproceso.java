package ejercicio2;

public interface Iproceso {
    void verSaldo();
    void ingresoAhorros();
    void ingresoCorriente();
    void retiroCorriente();
    void retiroAhorros();
    void ingresoCDT();
    void cerrarCDT();
}
abstract class proceso implements Iproceso{

}
