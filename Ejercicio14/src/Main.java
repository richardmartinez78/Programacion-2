// Clase principal
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de Figura
        Figura[] figuras = new Figura[5];
        figuras[0] = new Poligono();
        figuras[1] = new Estrella();
        figuras[2] = new Poligono();
        figuras[3] = new Poligono();
        figuras[4] = new Estrella();

        int contadorPoligonos = 0;
        int contadorEstrellas = 0;

        // Bucle para contar las instancias
        for (Figura figura : figuras) {
            if (figura instanceof Poligono) {
                contadorPoligonos++;
            } else if (figura instanceof Estrella) {
                contadorEstrellas++;
            }
        }

        System.out.println("Conteo de figuras:");
        System.out.println("Polígonos: " + contadorPoligonos);
        System.out.println("Estrellas: " + contadorEstrellas);
    }
}