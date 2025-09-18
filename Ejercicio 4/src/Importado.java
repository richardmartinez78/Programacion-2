public class Importado extends Articulo {
    private int anioImportacion;
    private float impuesto;

    public Importado(int codigo, String nombre, float precioCosto, int anioImportacion, float impuesto) {
        super(codigo, nombre, precioCosto);
        this.anioImportacion = anioImportacion;
        this.impuesto = impuesto;
    }

    public int getAnioImportacion() {
        return anioImportacion;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public float precioVenta() {
        float precioBase = super.precioVenta();

        if (anioImportacion <= 2008) {
            return precioBase + (impuesto * 0.80f); // 80% del impuesto
        } else {
            return precioBase + impuesto; // 100% del impuesto
        }
    }

    @Override
    public String tipoArticulo() {
        return "Importado";
    }
}