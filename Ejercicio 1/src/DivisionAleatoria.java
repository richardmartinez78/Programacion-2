import java.util.Random;
        public class DivisionAleatoria {
            public static void main(String[] args) {
                Random random = new Random();
                //1-Generar n{umeros aleatorios entre 0 y 10
                int a = random.nextInt(11); //o a 10
                int b = random.nextInt(11); //0 a 10

                //2-Mostrar valores
                System.out.println("Valor de a: " + a);
                System.out.println("Valor de b: " + b);

                //3- Verificar que b sea distinto de cero
                if (b !=0) {
                    int cociente = a / b; //Divisi{on entera
                    int resto = a % b; //m{odulo
                    System.out.println("Cociente: " + cociente);
                    System.out.println("Resto: " + resto);
                }
                else{
                    System.out.println("Error: no es posible dividir entre cero");
                }
            }
}