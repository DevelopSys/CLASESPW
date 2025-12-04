package ejercicio2;

import java.util.Scanner;

/*
Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
seleccione la acción que quiere realizar:
a. Imprimir array
b. Mover a izquierda
c. Mover a derecha
d. Invertir
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[11];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 20) + 1;// 0+1 - 19+1
        }


        // 16 12 16 4 4 14 5 12 13 10
        System.out.println("Indica que accion quieres realizar");
        System.out.println("1- imprimir");
        System.out.println("2- mover izquierda");
        System.out.println("3- mover derecha");
        System.out.println("4- invertir");
        System.out.println("5- rotar por pares");
        int opcion;
        do {
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int item : numeros) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                }
                case 2 -> {
                    int temporal = numeros[0];
                    for (int i = 0; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }
                    numeros[numeros.length - 1] = temporal;
                }
                case 3 -> {
                    int temporal = numeros[numeros.length - 1];
                    for (int i = numeros.length - 1; i > 0; i--) {
                        numeros[i] = numeros[i - 1];
                    }
                    numeros[0] = temporal;
                }
                case 4 -> {
                    for (int i = 0; i < numeros.length / 2; i++) {
                        int tempo = numeros[i];
                        numeros[i] = numeros[numeros.length - 1 - i];
                        numeros[numeros.length - 1 - i] = tempo;
                    }
                }
                case 5->{

                    boolean par = numeros.length%2==0;

                    for (int i = 0; i < numeros.length-1; i+=2) {
                        int temporal = numeros[i];
                        numeros[i] = numeros[i+1];
                        numeros[i+1] = temporal;
                    }
                }

            }
        } while (opcion != 6);


    }
}



