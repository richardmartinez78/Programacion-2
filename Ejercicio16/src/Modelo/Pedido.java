package frioexpress.modelo;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Cliente cliente;
    private Map<String, Double> productos;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new HashMap<>();
        this.total = 0.0;
    }

    public void agregarProducto(String codigoProducto, double cantidadKg, double precioPorKg) {
        productos.put(codigoProducto, cantidadKg);
        total += cantidadKg * precioPorKg;
    }

    public Cliente getCliente() { return cliente; }
    public Map<String, Double> getProductos() { return productos; }
    public double getTotal() { return total; }
}