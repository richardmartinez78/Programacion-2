import java.util.HashSet;
import java.util.Scanner;

public class CiudadesHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> ciudades = new HashSet<>();

        System.out.print("¿Cuántas ciudades desea ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar el buffer

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el nombre de la ciudad " + i + ": ");
            String ciudad = sc.nextLine();
            ciudades.add(ciudad);
        }

        System.out.println("\n--- Lista de ciudades ---");
        for (String c : ciudades) {
            System.out.println(c);
        }

        // Verificar si "Colonia" está presente
        if (ciudades.contains("Colonia")) {
            System.out.println("\n✅ 'Colonia' está en la lista.");
        } else {
            System.out.println("\n❌ 'Colonia' no está en la lista.");
        }

        sc.close();
    }
}