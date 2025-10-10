import java.util.Random;

// Clase SensorTemperatura que hereda de Sensor
class SensorTemperatura extends Sensor {
    @Override
    public void medir() {
        // Simulación de valor entre -10.0 y 40.0
        Random rand = new Random();
        this.valor = -10.0 + (40.0 - (-10.0)) * rand.nextDouble();
    }
}