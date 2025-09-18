// Clase base
public abstract class Articulo {
    private int codigo;
    private String nombre;
    private float precioCosto;

    public Articulo(int codigo, String nombre, float precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCosto = precioCosto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(float precioCosto) {
        this.precioCosto = precioCosto;
    }

    // Precio de venta base: costo + 20%
    public float precioVenta() {
        return precioCosto * 1.20f;
    }

    // Método abstracto a implementar en subclases
    public abstract String tipoArticulo();
}