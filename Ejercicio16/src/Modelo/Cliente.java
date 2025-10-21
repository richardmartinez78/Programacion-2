package frioexpress.modelo;

public class Cliente {
    private String rut;
    private String razonSocial;
    private String direccion;
    private double limiteCredito;
    private double deudaActual;

    public Cliente(String rut, String razonSocial, String direccion, double limiteCredito) {
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.limiteCredito = limiteCredito;
        this.deudaActual = 0.0;
    }

    public String getRut() { return rut; }
    public String getRazonSocial() { return razonSocial; }
    public String getDireccion() { return direccion; }
    public double getLimiteCredito() { return limiteCredito; }
    public double getDeudaActual() { return deudaActual; }

    public void setDeudaActual(double deudaActual) {
        this.deudaActual = deudaActual;
    }
}