package ejercicio1;

import java.util.Scanner;

public class EjercicioMatrices {
    private int[][] matrizA, matrizB, sumaMatrices;
    public EjercicioMatrices(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño quieres de matrices");
        int tamanio = scanner.nextInt();
        matrizA = new int[tamanio][tamanio];
        matrizB = new int[tamanio][tamanio];
        sumaMatrices = new int[tamanio][tamanio];
    }

    public void rellenarMatrices(){
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) (Math.random() * 17);
                matrizB[i][j] = (int) (Math.random() * 17);
                // sumaMatrices[i][j] = matrizA[i][j]+ matrizB[i][j];
            }
        }
        System.out.println("Matriz A:");
        imprimiMatriz(matrizA);
        System.out.println("Matriz B:");
        imprimiMatriz(matrizB);
        sumarMatrices();
        imprimiMatriz(sumaMatrices);
    }

    private void sumarMatrices(){
        for (int i = 0; i < sumaMatrices.length; i++) {
            for (int j = 0; j < sumaMatrices.length; j++) {
                sumaMatrices[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
    }

    private void imprimiMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for (int item: fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }
    }

    public static void metodoGeneral(){
        System.out.println("Ejecutado estaticamente");
    }
}
