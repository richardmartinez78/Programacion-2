import java.util.Map;
import java.util.TreeMap;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un TreeMap
        TreeMap<String, String> diccionario = new TreeMap<>();

        // Agregar palabras al diccionario
        diccionario.put("apple", "manzana");
        diccionario.put("house", "casa");
        diccionario.put("dog", "perro");
        diccionario.put("cat", "gato");
        diccionario.put("car", "coche");

        // Mostrar el diccionario en orden alfabético de las claves
        System.out.println("Diccionario inglés → español:");
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }
    }
}