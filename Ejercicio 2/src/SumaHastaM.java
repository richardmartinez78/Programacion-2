import java.util.Random;
public class SumaHastaM {
    public static void main(String[] args) {
        Random random = new Random();
        // 1- Generar número aleatorio entre 1 y 10
        int m= random.nextInt(10)+1; //De 1 al 10
        // 2- Mostrar el número generado
        System.out.println("Número generado (m):"+ m);
        //3- Calcular la suma usando un bucle
        int suma = 0;
        for (int i = 1; i<= m; i++) {
            suma += i;
        }
        //4- Mostrar resultado.
        System.out.println("Suma de enteros entre 1 y "+ m +":" + suma);

    }
}