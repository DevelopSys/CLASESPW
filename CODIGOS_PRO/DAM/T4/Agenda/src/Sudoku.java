// instrucciones del sudoku
public class Sudoku {
    private int[][] cuadrado = new int[4][4];


    public void iniciarCuadrado(){
        System.out.println("Procedemos a iniciar el sodoku");
        rellenarNumeros();
        mostrarNumeros();
    }
    public void rellenarNumeros(){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do{
                    aleatorio= (int) (Math.random()*20)+1;
                }while (estaNumero(aleatorio));
                // estaNumero(aleatorio);
                // solo si no esta en el cuadrado. En caso de si estar, genera otro
                cuadrado[i][j] = aleatorio; // 1-20
            }
            // 1-20 -> 8
            // 4 5 0
            // 0 0 0
            // 0 0 0
        }
        // guardar aquellos numeros que no estan repetidos
    }

    private boolean estaNumero(int numero){
        // el numero a comparar OK
        // recorrer que quieres recorrer OK
            // if comparando OK
        // 10
        // 2 4 6 7
        // 1 4 5 8
        // 42 23 22 12

        for ( int[] fila : cuadrado) {
            for ( int item : fila) {
                if(item == numero){
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarNumeros(){
        for ( int[] fila : cuadrado ) {
            for ( int  item: fila) {
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }
    }
}
