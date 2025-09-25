
// Clase Mago que hereda de Personaje
class Mago extends Personaje {
    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void accionEspecial() {
        System.out.println(getNombre() + " lanza un hechizo poderoso de nivel " + getNivel() + ".");
    }
}
