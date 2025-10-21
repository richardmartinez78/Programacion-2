import java.util.ArrayList;
import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("=== Cálculo del promedio ===");
        System.out.println("Ingresa números enteros (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("> ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Ingresa solo números enteros o 'fin' para salir.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            double suma = 0;
            for (int n : numeros) {
                suma += n;
            }
            double promedio = suma / numeros.size();
            System.out.println("\n📊 Promedio de los valores: " + promedio);
        }

        scanner.close();
    }
}