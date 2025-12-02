package ejercicio3;

import java.util.Scanner;

/*
Desarrolla un programa en Java que permita registrar, calcular e informar
las notas de varios alumnos utilizando arrays.
a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
nota inferior a 0 y superior a 10 volverá a pedirla
c. Calcula y muestra:
i. ii. iii. La nota media de la clase.
La nota más alta y la más baja.
Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
suspendido
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.println("Indicame la nota del alumno");
                nota = scanner.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Invalida");
                }
            } while (nota < 0.0 || nota > 10.0);
            notas[i] = nota;
        }

        int suspensos = 0, aprobados = 0;
        double media = 0, acumulador = 0;
        for (double item : notas) {
            if (item < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
            acumulador += item;
        }
        System.out.println("suspensos = " + suspensos);
        System.out.println("aprobados = " + aprobados);
        System.out.println("media = " + acumulador/notas.length);
    }
}
