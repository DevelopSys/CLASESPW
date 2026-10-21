package ejerciciosFor;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero del que quieres calcular el factorial");
        int numero = lector.nextInt();
        int factorial = 1;
        lector.close();
        System.out.println("Calculando el factorial de "+numero);
        for (int i = numero; i >=1 ; i--) {
            if(i==1){
                System.out.print(i);
            } else {
            System.out.print( i + " X ");
            }
            // i 5 4 3 2 1
            // 120
            factorial = factorial*i;
        }
        System.out.println();
        System.out.printf("El factorial de %d! es %d",numero,factorial);
        // 5
        /*
        5 *4 -> 20
        20 *3 -> 60
        60 *2 -> 120
        120 *1-> 120
         */
    }
}
