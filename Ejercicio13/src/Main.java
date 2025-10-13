// Clase principal para la ejecución
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de VehiculoAereo
        VehiculoAereo[] hangar = new VehiculoAereo[3];
        hangar[0] = new Avion("Boeing 747");
        hangar[1] = new Helicoptero("Apache AH-64");
        hangar[2] = new Avion("Airbus A380");

        // Recorrer el arreglo y mostrar el orden de despegue
        System.out.println("Orden de despegue:");
        for (int i = 0; i < hangar.length; i++) {
            System.out.print("Posición " + (i + 1) + ": ");
            hangar[i].despegar();
        }
    }
}