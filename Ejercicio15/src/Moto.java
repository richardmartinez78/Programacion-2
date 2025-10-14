import java.util.Random;
// Subclase Moto
class Moto extends Vehiculo {
    public Moto(String nombre) {
        super(nombre);
    }

    @Override
    public void avanzar() {
        // Avance aleatorio para una Moto (ej. 15-25 km)
        Random rand = new Random();
        double avance = 15 + (25 - 15) * rand.nextDouble();
        this.distanciaRecorrida += avance;
        System.out.printf("La moto %s avanzó %.2f km.%n", getNombre(), avance);
    }
}