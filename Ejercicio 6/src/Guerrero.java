// Clase Guerrero que hereda de Personaje
class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void accionEspecial() {
        System.out.println(getNombre() + " realiza un ataque de espada devastador de nivel " + getNivel() + ".");
    }
}
