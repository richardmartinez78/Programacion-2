// Clase principal para la ejecución
public class Main {
    public static void main(String[] args) {
        // Arreglo polimórfico de Robot
        Robot[] robots = new Robot[2];
        robots[0] = new RobotLimpieza();
        robots[1] = new RobotCocina();

        // Iterar sobre el arreglo y ejecutar la tarea de cada robot
        for (Robot r : robots) {
            r.realizarTarea();
        }
    }
}