import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cuantos estudiantes vas a guardar");
            int numeroEstudiantes = scanner.nextInt();
            // 5
            int[] calificaciones = new int[numeroEstudiantes]; // [0 0 0 0 0]

            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Introduce la calificacion del estudiante " + (i + 1));
                int calificacion = scanner.nextInt();
                calificaciones[i] = calificacion;
            }
            // [6 7 4 2 3]

            // mostrar todas la calificaciones del array
            // System.out.println(calificaciones); // muestra la direccion de memoria
            System.out.println(Arrays.toString(calificaciones)); // muestra el contenido del array
            /*System.out.println("Con for");
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println(calificaciones[i]);
            }

            System.out.println("Con forech");
            for (int item: calificaciones) {
                System.out.println(item);
            }*/
            // promedio [5,8,7,3,1]
            int totalCalificaciones = 0;
            int numeroAP = 0, nAlta = calificaciones[0], nBaja = calificaciones[0];
            // totalCalificaciones = 24
            for (int item : calificaciones) {
                // totalCalificaciones = totalCalificaciones + item;
                totalCalificaciones += item;
                /*if (item>=5){
                    numeroAP++;
                }*/
                numeroAP = item >= 5 ? numeroAP + 1 : numeroAP;
                /*
                if (item>nAlta){
                    nAlta = item;
                }
                if (item<nBaja){
                    nBaja = item;
                }*/
                nAlta = item>nAlta ? item : nAlta;
                // nAlta = Arrays.stream(calificaciones).max().getAsInt();
                nBaja = item<nBaja ? item : nBaja;
                // nBaja = Arrays.stream(calificaciones).min().getAsInt();
            }
            System.out.println("La media de las calificaciones es " + (double) totalCalificaciones / calificaciones.length);
            System.out.println("La nota mas alta es "+nAlta);
            System.out.println("La nota mas baja es "+nBaja);
            System.out.println("El numero de AP es "+numeroAP);
            // double media = Arrays.stream(calificaciones).asDoubleStream().average().getAsDouble();
            // System.out.println("La media de las calificaciones es " + media);
        } catch (Exception e) {
            System.out.println("Error en el cerrado");
        }
    }
}
