import java.util.LinkedList;
import java.util.Scanner;

public class ColaDeTareasInteractiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tareas = new LinkedList<>();
        int opcion;

        do {
            // Mostrar menú de opciones
            System.out.println("\n===== MENÚ DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Completar primera tarea");
            System.out.println("3. Ver tareas pendientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer del Scanner

            switch (opcion) {
                case 1:
                    // Agregar tarea
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String nuevaTarea = sc.nextLine();
                    tareas.add(nuevaTarea); // agrega al final de la cola
                    System.out.println("✅ Tarea agregada: " + nuevaTarea);
                    break;

                case 2:
                    // Completar la primera tarea
                    if (!tareas.isEmpty()) {
                        String completada = tareas.poll(); // elimina la primera
                        System.out.println("✅ Tarea completada: " + completada);
                        if (!tareas.isEmpty()) {
                            System.out.println("➡️  Siguiente tarea: " + tareas.peek());
                        } else {
                            System.out.println("🎉 No hay más tareas pendientes.");
                        }
                    } else {
                        System.out.println("⚠️  No hay tareas para completar.");
                    }
                    break;

                case 3:
                    // Mostrar tareas pendientes
                    if (tareas.isEmpty()) {
                        System.out.println("📭 No hay tareas pendientes.");
                    } else {
                        System.out.println("\n📋 Tareas pendientes:");
                        for (String t : tareas) {
                            System.out.println("- " + t);
                        }
                    }
                    break;

                case 4:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
    }
}