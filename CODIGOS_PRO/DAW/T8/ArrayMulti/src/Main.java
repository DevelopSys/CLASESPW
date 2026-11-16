import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[5]; // [0 0 0 0 0]
        numeros = new int[]{1, 2, 3, 4, 5}; // [1 2 3 4 5]
        /*
        0 0 0 0 -> array

        1 2 3 4
        5 6 7 8 -> array multi
        9 1 4 5
         */
        int[][] arrayMulti = new int[3][3];
        /*
        0 0 0
        0 0 0
        0 0 0
         */
        arrayMulti = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /*
        9 2 3
        4 20 6
        7 8 9
         */
        arrayMulti[1][1] = 20;
        arrayMulti[0][0] = 9;
        // System.out.println(arrayMulti[1][1]);
        // System.out.println(Arrays.toString(arrayMulti));
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print(arrayMulti[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] row : arrayMulti) {
            for (int item : row) {
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
