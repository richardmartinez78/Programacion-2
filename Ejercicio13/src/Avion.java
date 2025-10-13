// Subclase Avion que hereda de VehiculoAereo
class Avion extends VehiculoAereo {

    public Avion(String identificador) {
        super(identificador);
    }

    @Override
    public void despegar() {
        System.out.println("El avión " + getIdentificador() + " acelera en la pista y despega.");
    }
}