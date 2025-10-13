// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de PlataformaStreaming
        PlataformaStreaming[] plataformas = new PlataformaStreaming[2];
        plataformas[0] = new Netflix();
        plataformas[1] = new YouTube();

        // Arreglo de contenidos de ejemplo
        String[] contenidosNetflix = {"Stranger Things", "The Witcher", "La Casa de Papel"};
        String[] contenidosYouTube = {"Tutorial de Java", "Video de cocina", "Reseña de un videojuego"};

        System.out.println("--- Contenidos de Netflix ---");
        for (String contenido : contenidosNetflix) {
            plataformas[0].reproducirContenido(contenido);
        }

        System.out.println("\n--- Contenidos de YouTube ---");
        for (String contenido : contenidosYouTube) {
            plataformas[1].reproducirContenido(contenido);
        }
    }
}