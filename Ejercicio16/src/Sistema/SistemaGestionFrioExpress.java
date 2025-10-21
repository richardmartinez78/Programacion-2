package frioexpress.sistema;  // 🔹 Debe ir primero

import frioexpress.excepciones.StockMinimoAlcanzadoException;
import frioexpress.excepciones.*;
import frioexpress.modelo.*;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class SistemaGestionFrioExpress {
    private TreeMap<String, Producto> inventario;
    private HashMap<String, Producto> inventarioPorCategoria;
    private LinkedList<Pedido> pedidosPendientes;

    public SistemaGestionFrioExpress() {
        this.inventario = new TreeMap<>();
        this.inventarioPorCategoria = new HashMap<>();
        this.pedidosPendientes = new LinkedList<>();
    }

    public void inicializarDatos(Map<String, Cliente> clientes) {
        inventario.put("P001", new Producto("P001", "Carne vacuna", "carnes", -18, 200, 50, 600));
        inventario.put("P002", new Producto("P002", "Pechuga de pollo", "carnes", -18, 100, 30, 450));
        inventario.put("P003", new Producto("P003", "Merluza", "pescados", -18, 80, 20, 550));
        inventario.put("P004", new Producto("P004", "Brócoli", "vegetales", -18, 60, 20, 300));
        inventario.put("P005", new Producto("P005", "Helado vainilla", "helados", -18, 150, 40, 700));
        inventario.put("P006", new Producto("P006", "Helado chocolate", "helados", -18, 180, 40, 750));
        inventario.put("P007", new Producto("P007", "Espinaca", "vegetales", -18, 55, 15, 280));
        inventario.put("P008", new Producto("P008", "Calamar", "pescados", -18, 70, 25, 600));

        clientes.put("20123456-7", new Cliente("20123456-7", "Supermercado Sol", "Av. Central 1234", 300000));
        clientes.put("20987654-3", new Cliente("20987654-3", "Restaurante MarAzul", "Rbla. 45", 150000));
        clientes.put("20876543-2", new Cliente("20876543-2", "Tienda El Buen Gusto", "Ituzaingó 567", 50000));
        clientes.put("20111222-5", new Cliente("20111222-5", "Cafetería Deli", "Rivera 333", 40000));
    }

    public void procesarPedido(Cliente cliente, String codigoProducto, double cantidadKg)
            throws ProductoNoCongeladoException, StockInsuficienteException,
            LimiteCreditoExcedidoException, StockMinimoAlcanzadoException {
        Producto producto = inventario.get(codigoProducto);
        if (producto == null) {
            throw new ProductoNoCongeladoException("❌ Producto con código " + codigoProducto + " no encontrado.");
        }

        if (producto.getStockActualKg() < cantidadKg) {
            throw new StockInsuficienteException("⚠️ Stock insuficiente para el producto " + producto.getNombre());
        }

        double totalPedido = cantidadKg * producto.getPrecioPorKg();
        if (cliente.getDeudaActual() + totalPedido > cliente.getLimiteCredito()) {
            throw new LimiteCreditoExcedidoException("💳 Límite de crédito excedido para " + cliente.getRazonSocial());
        }

        producto.setStockActualKg(producto.getStockActualKg() - cantidadKg);
        cliente.setDeudaActual(cliente.getDeudaActual() + totalPedido);

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(codigoProducto, cantidadKg, producto.getPrecioPorKg());
        pedidosPendientes.add(pedido);

        System.out.println("✅ Pedido procesado: " + producto.getNombre() + " - " + cantidadKg + " kg");

        if (producto.getStockActualKg() <= producto.getStockMinimoKg()) {
            throw new StockMinimoAlcanzadoException("⚠️ Producto " + producto.getNombre() + " alcanzó stock mínimo.");
        }
    }

    public void registrarTemperatura(String codigoProducto, double nuevaTemperatura)
            throws ProductoNoCongeladoException, CadenaFrioRotaException {
        Producto producto = inventario.get(codigoProducto);
        if (producto == null) {
            throw new ProductoNoCongeladoException("❌ Producto con código " + codigoProducto + " no encontrado.");
        }

        producto.setTemperatura(nuevaTemperatura);
        if (nuevaTemperatura > -18) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if (producto.getTiempoFueraTemperatura() > 0.5) {
                throw new CadenaFrioRotaException("🔥 Cadena de frío rota para " + producto.getNombre());
            }
        }
    }

    public void mostrarProductosBajoStock() {
        System.out.println("\n📉 Productos bajo stock mínimo:");
        for (Producto p : inventario.values()) {
            if (p.getStockActualKg() <= p.getStockMinimoKg()) {
                System.out.println("- " + p.getNombre() + " (" + p.getStockActualKg() + " kg disponibles)");
            }
        }
    }

    public void mostrarPedidosPendientes() {
        System.out.println("\n📦 Pedidos pendientes de despacho:");
        for (Pedido p : pedidosPendientes) {
            System.out.println("- Cliente: " + p.getCliente().getRazonSocial() +
                    " | Total: $" + p.getTotal());
        }
    }
}