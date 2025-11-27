import java.util.Arrays;

public class MainMultidimensional {

    public static void main(String[] args) {
        /*
        // int[][] matriz = new int[3][3];
        int[][] matriz = new int[][]{{4, 8, 9}, {14, 16, 14}, {12, 4, 7}};
        // 3 filas
        // 3 columnas
        // 4   7  9
        // 14 17 19
        // 13  4  7
        // matriz[2] -> [0,0,0]
        // matriz[2][1] -> 0
        // cuantas filas tengo
        System.out.println("El tamaño de las filas es de "+matriz.length);
        // cuantas columnas tiene la primera fila
        System.out.println("El tamaño de las columnas es de la primera fila "+matriz[0].length);
        System.out.println("El tamaño de las columnas es de la segundo fila "+matriz[1].length);
        System.out.println("El tamaño de las columnas es de la tercera fila "+matriz[2].length);
        // Obtener un elemento en concreto
        // matriz[2][0] =6;
        System.out.println("El elemento buscado es "+matriz[2][0]);
        // sacar todos los elementos -> for anidado
        // System.out.println(Arrays.toString(matriz));
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]%2==0){
                    System.out.print(matriz[i][j]+"\t");
                }
            }
            System.out.println();
        }
        for ( int[] fila : matriz ) {
            for (int item : fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }*/
        Sudoku sudoku = new Sudoku();
        // int[3][3]
        sudoku.empezarJuego();
    }
}
