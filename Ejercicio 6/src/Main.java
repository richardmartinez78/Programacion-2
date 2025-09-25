// Clase principal para probar las implementaciones
public class Main {
    public static void main(String[] args) {
        Personaje mago = new Mago("Gandalf", 10);
        Personaje guerrero = new Guerrero("Aragorn", 12);

        mago.accionEspecial();
        guerrero.accionEspecial();
    }
}