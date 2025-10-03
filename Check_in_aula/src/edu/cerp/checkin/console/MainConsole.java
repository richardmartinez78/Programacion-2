package edu.cerp.checkin.console;

import edu.cerp.checkin.logic.SesionService;
import edu.cerp.checkin.model.Inscripcion;

import java.util.List;
import java.util.Scanner;

public class MainConsole {

    public static void run(SesionService service) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        System.out.println("=================================");
        System.out.println("   Bienvenido a Check-in Aula");
        System.out.println("=================================");

        while (op != 0) {
            mostrarMenu();
            System.out.print("> ");
            String input = sc.nextLine().trim();

            try {
                op = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                op = -1;
            }

            switch (op) {
                case 1 -> registrar(sc, service);
                case 2 -> listar(service.listar());
                case 3 -> buscar(sc, service);
                case 4 -> System.out.println(service.resumen());
                case 0 -> System.out.println("👋 ¡Hasta luego!");
                default -> System.out.println("⚠ Opción inválida, intenta nuevamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n== Menú ==");
        System.out.println("1) Registrar");
        System.out.println("2) Listar inscripciones");
        System.out.println("3) Buscar por texto");
        System.out.println("4) Resumen por curso");
        System.out.println("0) Salir");
    }

    private static void registrar(Scanner sc, SesionService service) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Documento: ");
        String documento = sc.nextLine();
        System.out.print("Curso [Prog 1/Prog 2/Base de Datos]: ");
        String curso = sc.nextLine();

        service.registrar(nombre, documento, curso);
        System.out.println("✔ Inscripción registrada con éxito.");
    }

    private static void buscar(Scanner sc, SesionService service) {
        System.out.print("Texto a buscar: ");
        String query = sc.nextLine();
        listar(service.buscar(query));
    }

    private static void listar(List<Inscripcion> lista) {
        if (lista.isEmpty()) {
            System.out.println("(sin inscripciones para mostrar)");
            return;
        }

        System.out.printf("%-20s %-12s %-15s %-20s%n",
                "Nombre", "Documento", "Curso", "Hora");
        System.out.println("-----------------------------------------------------------------------");

        for (Inscripcion i : lista) {
            System.out.printf("%-20s %-12s %-15s %-20s%n",
                    i.getNombre(), i.getDocumento(), i.getCurso(), i.getFechaHora());
        }
    }
}