import java.util.ArrayList;
import java.util.Iterator;

public class PromedioPrecios {
    public static void main(String[] args) {
        // Crear ArrayList con precios
        ArrayList<Double> precios = new ArrayList<>();
        precios.add(150.0);
        precios.add(200.5);
        precios.add(99.99);
        precios.add(350.75);
        precios.add(120.0);

        // Usar Iterator para recorrer el ArrayList
        Iterator<Double> it = precios.iterator();
        double suma = 0.0;
        int cantidad = 0;

        while (it.hasNext()) {
            double precio = it.next();
            suma += precio;
            cantidad++;
        }

        // Calcular promedio
        double promedio = 0.0;
        if (cantidad > 0) {
            promedio = suma / cantidad;
        }

        System.out.println("Precios: " + precios);
        System.out.println("Promedio de precios: " + promedio);
    }
}