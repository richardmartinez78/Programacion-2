// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Creación de objetos polimórficos
        InstrumentoMusical miGuitarra = new Guitarra();
        InstrumentoMusical miPiano = new Piano();

        // Llamada a los métodos
        miGuitarra.tocarNota("Do");
        miPiano.tocarNota("Do");
    }
}
