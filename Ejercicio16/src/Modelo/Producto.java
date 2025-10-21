package frioexpress.modelo;

import java.time.LocalDateTime;

public class Producto {
    private String codigo;
    private String nombre;
    private String categoria;
    private double temperatura;
    private double stockActualKg;
    private double stockMinimoKg;
    private double precioPorKg;
    private LocalDateTime ultimaMedicionTemperatura;

    public Producto(String codigo, String nombre, String categoria, double temperatura,
                    double stockActualKg, double stockMinimoKg, double precioPorKg) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.temperatura = temperatura;
        this.stockActualKg = stockActualKg;
        this.stockMinimoKg = stockMinimoKg;
        this.precioPorKg = precioPorKg;
        this.ultimaMedicionTemperatura = LocalDateTime.now();
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public double getTemperatura() { return temperatura; }
    public double getStockActualKg() { return stockActualKg; }
    public double getStockMinimoKg() { return stockMinimoKg; }
    public double getPrecioPorKg() { return precioPorKg; }

    public void setStockActualKg(double stockActualKg) {
        this.stockActualKg = stockActualKg;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.ultimaMedicionTemperatura = LocalDateTime.now();
    }

    public long getTiempoFueraTemperatura() {
        return java.time.Duration.between(ultimaMedicionTemperatura, LocalDateTime.now()).toMinutes();
    }
}