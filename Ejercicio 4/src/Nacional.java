public class Nacional extends Articulo {
    private String departamento;
    private boolean subsidiado;

    public Nacional(int codigo, String nombre, float precioCosto, String departamento, boolean subsidiado) {
        super(codigo, nombre, precioCosto);
        this.departamento = departamento;
        this.subsidiado = subsidiado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean getSubsidiado() {
        return subsidiado;
    }

    public void setSubsidiado(boolean subsidiado) {
        this.subsidiado = subsidiado;
    }

    @Override
    public float precioVenta() {
        float precioBase = super.precioVenta();

        if (subsidiado) {
            return precioBase; // No se agrega extra
        } else {
            if (departamento.equalsIgnoreCase("Montevideo")) {
                return precioBase * 1.15f; // +15%
            } else {
                return precioBase * 1.10f; // +10%
            }
        }
    }

    @Override
    public String tipoArticulo() {
        return "Nacional";
    }
}