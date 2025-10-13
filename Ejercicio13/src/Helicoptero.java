// Subclase Helicoptero que hereda de VehiculoAereo
class Helicoptero extends VehiculoAereo {

    public Helicoptero(String identificador) {
        super(identificador);
    }

    @Override
    public void despegar() {
        System.out.println("El helicóptero " + getIdentificador() + " asciende verticalmente y despega.");
    }
}