import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("=== Ingreso de nombres ===");
        System.out.println("Escribe un nombre (o escribe 'fin' para terminar):");

        while (true) {
            System.out.print("> ");
            String nombre = scanner.nextLine().trim();

            if (nombre.equalsIgnoreCase("fin")) {
                break; // termina el ingreso
            }

            if (!nombre.isEmpty()) {
                nombres.add(nombre);
            } else {
                System.out.println("⚠️ No se puede ingresar un nombre vacío.");
            }
        }

        System.out.println("\n=== Nombres ingresados ===");
        for (String n : nombres) {
            System.out.println("- " + n);
        }

        scanner.close();
    }
}