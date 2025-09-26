// Clase abstracta Personaje
public abstract class Personaje {
    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void accionEspecial();

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }
}
