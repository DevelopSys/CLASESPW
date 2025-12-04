package ejercicio1;

import java.util.Scanner;

public class Main {

    /*
    Crea un programa que permita sumar arrays multidimensionales. Para ello
    siguiente estos pasos:
    a. Pide al usuario el tamaño de las matrices
    b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
    16
    c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
    de las celdas de las generadas en el punto anterior
    d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
    para poder identificarlas
     */
    static int[][] matrizA;
    static int[][] matrizB;

    public static void main(String[] args) {

        // arrays multidimensionales => elementos que tiene mas de una dimension, filas columas -> matrices
        /*
            int[][] matriz = new int[][]{ {1,2,3},{4,5,6},{7,8,9}}
            int[][] matriz = new int[3][3]
            0 0 0
            0 0 0
            0 0 0
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que tamaño tienen las matrices");
        int tamanio = scanner.nextInt();
        matrizA = new int[tamanio][tamanio];
        matrizB = new int[tamanio][tamanio];

        // int[][] sumaMatrices = new int[tamanio][tamanio];
        /*
            MatrizA
            12 32 30
            0 0 0
            0 0 0

            MatrizB i=2
            0 0 0
            0 0 0
            0 0 0
         */
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matrizA[i][j] = (int) (Math.random() * 17);
                matrizB[i][j] = (int) (Math.random() * 17);
                // sumaMatrices[i][j] = matrizA[i][j]+ matrizB[i][j];
            }
        }

        System.out.println("Imprimiendo la matriz A");
        imprimirArray(matrizA);
        System.out.println("Imprimiendo la matriz B");
        imprimirArray(matrizB);

        int[][] sumaMatrices = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sumaMatrices[i][j] = matrizB[i][j] + matrizA[i][j];
            }
        }
        System.out.println("Imprimiendo la matriz suma");
        imprimirArray(sumaMatrices);
    }


    public static void imprimirArray(int[][] matriz){
        // matriz es una referencia para utilizarlo en el xuerpo del metodo
        for ( int[] fila : matriz ) {
            for (int item: fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }
    }


}
