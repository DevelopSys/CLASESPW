public class Main {

    public static void main(String[] args) {
        int[] datos = new int[5]; // 0 0 0 0 0
        datos = new int[]{1, 2, 3, 4, 5}; // 1 2 3 4 5

        int[][] matriz = new int[4][5]; // row col
        /*
        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0
         */
        matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /*
        80 7 1
        4 5 6
        7 8 9
         */
        matriz[0][0] = 80;
        matriz[0][1] = 7;
        matriz[0][2] = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() *11);
            }
        }
        System.out.println("El elemento central es "+matriz[1][1]);
        System.out.println("El primer elemento es "+ matriz[0][0]);
        System.out.println("El ultimo elemento es "+ matriz[2][2]);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }

        for (int[] row: matriz) {
            for (int item: row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        // TODO cuadrado magico
        /*
        Crea una aplicacion que permita al sistema generar una matriz 4x4 con numeros aleatorios
        Dicha matriz tendrá que ser magica
            los valores de cada columna, fila y matriz suman el mismo numero
        En caso de ser magico el cuadrado, se mostrará en pantalla, en caso de no serlo, el sistema deberá
        volvar a generar otro cuadrado
         */
    }
}
