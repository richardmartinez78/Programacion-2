import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de InstrumentoMusical
        InstrumentoMusical[] orquesta = new InstrumentoMusical[4];
        orquesta[0] = new Guitarra();
        orquesta[1] = new Piano();
        orquesta[2] = new Guitarra();
        orquesta[3] = new Piano();

        // Arreglo de notas predefinidas
        String[] notas = {"Do", "Re", "Mi", "Fa", "Sol", "La", "Si"};
        Random random = new Random();

        // Se recorre el arreglo de instrumentos
        for (InstrumentoMusical instrumento : orquesta) {
            System.out.println("Es el turno del instrumento: " + instrumento.getClass().getSimpleName());
            // Cada instrumento toca 3 notas aleatorias
            for (int i = 0; i < 3; i++) {
                String notaAleatoria = notas[random.nextInt(notas.length)];
                instrumento.tocarNota(notaAleatoria);
            }
            System.out.println("---");
        }
    }
}
