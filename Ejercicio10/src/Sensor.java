import java.util.Random;

// Clase base abstracta Sensor
public abstract class Sensor {
    protected double valor;

    public abstract void medir();

    public double getValor() {
        return valor;
    }
}