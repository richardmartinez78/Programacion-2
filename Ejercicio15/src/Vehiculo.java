import java.util.Random;

// Clase base abstracta Vehiculo
public abstract class Vehiculo {
    protected String nombre;
    protected double distanciaRecorrida;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
    }

    // Método abstracto para avanzar
    public abstract void avanzar();

    public String getNombre() {
        return nombre;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
}
