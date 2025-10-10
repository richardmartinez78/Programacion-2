import java.util.Random;

// Clase SensorPresion que hereda de Sensor
class SensorPresion extends Sensor {
    @Override
    public void medir() {
        // Simulación de valor entre 950.0 y 1050.0
        Random rand = new Random();
        this.valor = 950.0 + (1050.0 - 950.0) * rand.nextDouble();
    }
}