// Clase base abstracta VehiculoAereo
public abstract class VehiculoAereo {
    private String identificador;

    public VehiculoAereo(String identificador) {
        this.identificador = identificador;
    }

    // Método abstracto para el despegue
    public abstract void despegar();

    public String getIdentificador() {
        return identificador;
    }
}