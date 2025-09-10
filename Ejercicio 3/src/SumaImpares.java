import java.util.Random;
public class SumaImpares {
    public static void main(String[] args) {
        Random random = new Random();
        int suma=0; // Acumulador de impares

        // 1-Genera números hasta que la suma de impares supere 25
        while (suma<=25) {
            int numero = random.nextInt(11); //De 0 a 10
        System.out.print("Número generado:" + numero);

        // 2- Verificar si es par o impar
        if (numero % 2 ==0) {
            System.out.println("Es par");}
        else{
            System.out.println("Es impar");
            suma += numero; // Suma solo si es impar
        }
        }
        // 3- Mostrar el resultado final
        System.out.println("La suma total de impares es: " + suma);
    }
}