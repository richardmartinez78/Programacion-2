import java.util.Random;

// Subclase Auto
class Auto extends Vehiculo {
    public Auto(String nombre) {
        super(nombre);
    }

    @Override
    public void avanzar() {
        // Avance aleatorio para un Auto (ej. 10-20 km)
        Random rand = new Random();
        double avance = 10 + (20 - 10) * rand.nextDouble();
        this.distanciaRecorrida += avance;
        System.out.printf("El auto %s avanzó %.2f km.%n", getNombre(), avance);
    }
}