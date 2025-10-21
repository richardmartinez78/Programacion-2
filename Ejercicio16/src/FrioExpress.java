package frioexpress;

import frioexpress.excepciones.*;
import frioexpress.modelo.*;
import frioexpress.sistema.SistemaGestionFrioExpress;

import java.util.HashMap;
import java.util.Map;

public class FrioExpress {
    public static void main(String[] args) {
        SistemaGestionFrioExpress sistema = new SistemaGestionFrioExpress();
        Map<String, Cliente> clientes = new HashMap<>();
        sistema.inicializarDatos(clientes);

        System.out.println("=== Sistema de Gestión FríoExpress ❄️ ===\n");

        try {
            // Caso 1: Pedido exitoso
            sistema.procesarPedido(clientes.get("20123456-7"), "P001", 20);

            // Caso 2: Stock insuficiente
            sistema.procesarPedido(clientes.get("20123456-7"), "P002", 500);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Caso 3: Límite de crédito excedido
            sistema.procesarPedido(clientes.get("20876543-2"), "P005", 200);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Caso 4: Producto inexistente
            sistema.procesarPedido(clientes.get("20987654-3"), "P999", 10);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Caso 5: Alerta de cadena de frío rota
            sistema.registrarTemperatura("P003", -10);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Caso 6: Reporte de productos bajo stock mínimo
        sistema.mostrarProductosBajoStock();

        // Caso 7: Pedidos pendientes de despacho
        sistema.mostrarPedidosPendientes();
    }
}