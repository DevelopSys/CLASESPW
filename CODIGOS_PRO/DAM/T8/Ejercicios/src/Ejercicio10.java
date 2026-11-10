import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Cuantos estudiantes hay en clase");
            int nEstudiantes = scanner.nextInt(); // 5
            int[] calificaciones = new int[nEstudiantes]; //  [0,0,0,0,0]
            int posicion = 0;
            /*while (posicion<nEstudiantes){
                calificaciones[posicion] = 1;
                posicion++;
            }*/
            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Introduce la calificacion del estudiante " + (i + 1));
                calificaciones[i] = scanner.nextInt();
            }
            // [2,7,4,9,6]
            // [x,x,x,x,x]

            /*
            for (int item: calificaciones) {
                System.out.print(item + " ");
            }

            for (int i = 0; i < calificaciones.length; i++) {
                System.out.print(calificaciones[i]);
            }*/
            System.out.println(Arrays.toString(calificaciones));
            // System.out.println(calificaciones); // direccion de memoria
            // cierra los elementos definidos en el try ()
            int totalCalificaciones = 0, nAprobados = 0, nAlta=calificaciones[0] , nBaja = calificaciones[0];
            // [2,7,4,9,6]
            for (int item : calificaciones) {
                totalCalificaciones += item;
                // totalCalificaciones = totalCalificaciones + item;
                /*if (item >= 5){
                    nAprobados++;
                }*/
                nAprobados = item >= 5 ? nAprobados + 1 : nAprobados;
                /*if (item> nAlta){
                    nAlta = item;
                }*/
                nAlta = item>nAlta ? item : nAlta;
                // nAlta = Arrays.stream(calificaciones).max().getAsInt();
                /*if (item<nBaja){
                    nBaja = item;
                }*/
                nBaja = item<nBaja ? item : nBaja;
                // nBaja = Arrays.stream(calificaciones).min().getAsInt();
            }
            // nAlta= nBaja=
            // double media = Arrays.stream(calificaciones).asDoubleStream().average().getAsDouble();
            System.out.println("La media de las calificaciones es de " + (double) totalCalificaciones / nEstudiantes);
            System.out.println("El numero de aprobados es de " + nAprobados);
            System.out.println("La calificacion maxima es "+nAlta);
            System.out.println("La calificacion minima es "+nBaja);

        } catch (Exception e) {
            System.out.println("Error en el programa");
        }
    }
}
