public class MainCuadrado {

    static int[][] cuadrado = new int[3][3];

    public static void main(String[] args) {
        do{
            generarCuadrado();
        }while (!esMagico());
        mostrarCuadrado();

    }

    public static void mostrarCuadrado(){
        for (int[] fila: cuadrado) {
            for (int item: fila) {
                System.out.print(item +" ");
            }
            System.out.println();
        }
    }

    public static void generarCuadrado(){

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do{
                    aleatorio = (int) (Math.random()*11);

                }while (estaNumero(aleatorio));
                cuadrado[i][j] = aleatorio;
            }
        }
    }

    public static boolean esMagico(){

        int suma = 0;
        for (int i = 0; i < cuadrado[0].length; i++) {
            suma += cuadrado[0][i];
        }

        // comprobacion filas
        for (int i = 1; i < cuadrado.length; i++) {
        int sumaFila =0;
            for (int j = 0; j < cuadrado[i].length; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila!=suma){
                return false;
            }
        }

        // comprobacion columnas
        for (int i = 0; i < cuadrado.length; i++) {
            int sumaCol = 0;
            for (int j = 0; j < cuadrado.length; j++) {
                sumaCol += cuadrado[j][i];
            }
            if (sumaCol != suma){
                return false;
            }
        }

        // comprobacion diagonales
        int sumaDiag1 =0;
        for (int i = 0; i < cuadrado.length; i++) {
            sumaDiag1+=cuadrado[i][i];
        }
        if (sumaDiag1 != suma){
            return false;
        }

        int sumaDiag2 =0;
        for (int i = cuadrado.length-1; i >= 0; i--) {
            sumaDiag2+=cuadrado[cuadrado.length-1-i][i];
        }
        if (sumaDiag2 != suma){
            return false;
        }

        return true;
    }

    public static boolean estaNumero(int numero){
        for (int[] item: cuadrado) {
            for (int element: item) {
                if (element == numero){
                    return true;
                }
            }
        }
        return false;
    }


}
