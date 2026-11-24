import java.util.ArrayList;
import java.util.Scanner;

public class MainInvisible {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Cuantos alumnos hay en clase");
            int nAlumnos = scanner.nextInt();
            for (int i = 0; i < nAlumnos; i++) {
                System.out.println("Indica el nombre del alumno de la clase");
                String nombre = scanner.next();
                list.add(nombre);
            }
            // sacar a un alumno a la pizarra
            // Math.random()*4  0 - 0.9999 -> 0*4 = 0  0.999*4 3
            // [a,s,d,f] -> [0-3]
            System.out.println("Le toca salir a la pizarra a :"+list.get((int) (Math.random() * list.size())));
        }
    }
}
