// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de Sensores
        Sensor[] sensores = new Sensor[4];
        sensores[0] = new SensorTemperatura();
        sensores[1] = new SensorPresion();
        sensores[2] = new SensorTemperatura();
        sensores[3] = new SensorPresion();

        // Recorrer el arreglo y mostrar mediciones
        for (Sensor s : sensores) {
            s.medir();
            if (s instanceof SensorTemperatura) {
                System.out.printf("Temperatura: %.2f °C%n", s.getValor());
            } else if (s instanceof SensorPresion) {
                System.out.printf("Presión: %.2f hPa%n", s.getValor());
            }
        }
    }
}