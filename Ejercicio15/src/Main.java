// Clase principal de la carrera
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de Vehiculo
        Vehiculo[] competidores = new Vehiculo[4];
        competidores[0] = new Auto("Ferrari");
        competidores[1] = new Moto("Harley");
        competidores[2] = new Auto("Lamborghini");
        competidores[3] = new Moto("Ducati");

        final int RONDAS = 5;

        // Simulación de la carrera
        for (int ronda = 1; ronda <= RONDAS; ronda++) {
            System.out.println("\n--- Ronda " + ronda + " ---");
            for (Vehiculo v : competidores) {
                v.avanzar();
            }
        }

        // Determinar y mostrar el ganador
        Vehiculo ganador = competidores[0];
        for (int i = 1; i < competidores.length; i++) {
            if (competidores[i].getDistanciaRecorrida() > ganador.getDistanciaRecorrida()) {
                ganador = competidores[i];
            }
        }

        System.out.println("\n--- Fin de la carrera ---");
        System.out.printf("¡El ganador es %s con un total de %.2f km recorridos!%n",
                ganador.getNombre(), ganador.getDistanciaRecorrida());
    }
}