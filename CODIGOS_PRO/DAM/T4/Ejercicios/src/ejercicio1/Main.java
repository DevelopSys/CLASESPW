package ejercicio1;


import java.util.Scanner;

/*
Crea un programa que permita sumar arrays multidimensionales. Para ello
siguiente estos pasos:
a. Pide al usuario el tamaño de las matrices
b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
50
c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
de las celdas de las generadas en el punto anterior
d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
para poder identificarlas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño tienen las matrices");
        int tamanio = scanner.nextInt();
        int[][] matriz1 = new int[tamanio][tamanio];
        int[][] matriz2 = new int[tamanio][tamanio];
        int[][] sumaMatrices = new int[tamanio][tamanio];

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz2[i][j] = (int) (Math.random()*51);
                matriz1[i][j] = (int) (Math.random()*51);
            }
        }
        System.out.println("Imprimiendo matriz 1");
        imprimirArray(matriz1);
        System.out.println("Imprimiendo matriz 2");
        imprimirArray(matriz2);
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sumaMatrices[i][j] = matriz1[i][j]+ matriz2[i][j];
            }
        }
        System.out.println("Imprimiendo suma");
        imprimirArray(sumaMatrices);

    }

    public static void imprimirArray(int[][] matriz){
        for (int[] fila: matriz) {
            for (int item: fila) {
                System.out.print(item +"\t");
            }
            System.out.println();
        }
    }
}

