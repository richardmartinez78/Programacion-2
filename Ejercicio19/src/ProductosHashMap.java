import java.util.HashMap;
import java.util.Map;

public class ProductosHashMap {
    public static void main(String[] args) {
        // Crear el HashMap
        HashMap<Integer, String> productos = new HashMap<>();

        // Agregar productos (clave = código, valor = nombre)
        productos.put(101, "Helado de vainilla");
        productos.put(102, "Pizza congelada");
        productos.put(103, "Carne vacuna");
        productos.put(104, "Verduras mixtas");
        productos.put(105, "Filete de merluza");

        // Mostrar todos los productos
        System.out.println("=== Lista de productos ===");
        for (Map.Entry<Integer, String> entry : productos.entrySet()) {
            System.out.println("Código: " + entry.getKey() + " → " + entry.getValue());
        }
    }
}