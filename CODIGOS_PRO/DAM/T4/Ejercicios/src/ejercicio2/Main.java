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
        int[] numeros = new int[11];
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        // 0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0
        for (int i = 0; i < numeros.length; i++) {
            int aletorio = (int) (Math.random() * 20) + 1;
            numeros[i] = aletorio;
        }

        System.out.println("1- imprimir el array");
        System.out.println("2- mover a izquierda");
        System.out.println("3- mover a derecha");
        System.out.println("4- invertir");
        System.out.println("5- rotar por pares");
        System.out.println("Que opcion quieres hace");
        do {

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
                    for (int i = 0; i < numeros.length/2; i++) {
                        int temp = numeros[i];
                        numeros[i] = numeros[numeros.length-1-i];
                        numeros[numeros.length-1-i] = temp;
                    }
                }

                case 5 -> {
                    int recorrido;
                    if (numeros.length%2!=0){
                        recorrido = numeros.length-1;
                    }else{
                        recorrido = numeros.length;
                    }
                    for (int i = 0; i < recorrido; i+=2) {
                        int temp = numeros[i];
                        numeros[i] = numeros[i+1];
                        numeros[i+1] = temp;
                    }
                }
            }
        } while (opcion != 6);

    }
}
