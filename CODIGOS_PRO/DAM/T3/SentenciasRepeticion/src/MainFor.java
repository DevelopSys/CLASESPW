import java.util.Scanner;

public class MainFor {

    public static void main(String[] args) {
        /*FOR - FOREACH
            [0]
            for(int i=0 ; i<5 ; i++)
            {
              puedes acceder a la i
              bloque de codigo a repetir
            }
            no puedes acceder a la i
         */
        // [0 1 2 3 4 5) [0 2 4 6)
        /*
        for (int i = 0; i <10 ; i++) {
            System.out.println("Ejecucion "+i);
            /*if (i % 2 == 0) {
                System.out.println("Ejecucion numero " + (i));
            } else {
                System.out.println("Impar");
            }
        }
        for (int i = 9; i>=0; i--){
            System.out.println("Ejecucion "+i);
        }*/
        // 8*0 = 0
        // 8*1 = 8
        // 8*2 = 16
        // 8*3 = 24
        // 8*4 = 32
        // 8*5 = 40
        Scanner lector = new Scanner(System.in);
        // System.out.println("Indica el numero para ver su tabla");
        int numero = 10; // 8
        int n1 = 7; int n2 = 20;
        int max = n1; int min = n2;
        if (n2>max){
            max = n2;
            min = n1;
        } else {
            max = n1;
            min = n2;
        }
        if (numero < 0) {
            System.out.println("Numero negativo, no se puede");
        } else {
            // sacar las tablas de multiplicar del 0 al 10
            for (int i = n1; i <=n2; i++) {
                System.out.println("Tabla del " + i);
                // i=0
                for (int j = 0; j<11; j++){
                    System.out.printf("\tLa multiplicacion del %d * %d = %d\n",i,j,j*i);
                }
            }
        }
    }
}
