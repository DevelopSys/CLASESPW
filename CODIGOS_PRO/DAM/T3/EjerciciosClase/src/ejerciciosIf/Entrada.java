package ejerciciosIf;

import java.util.Scanner;

public class Entrada {

    /*
    Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos
    elevado a 3 coincide con dicho número.
    Por ejemplo, 153 = 1+125+27.
    Dado un número de 3 cifras determinar si es o no un número Armstrong.
    Se comprobará previamente que el número introducido tiene 3 dígitos.
    En la salida se mostrará uno de los siguientes mensajes:

1. “El número no tiene 3 dígitos”
2. “Es un número Armstrong”
3. “No es un número Armstrong”.
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero que quieres evaluar");
        int numero = lector.nextInt();

        if (numero<100 || numero>999){
            System.out.println("No es numero valido, no tiene 3 digitos");
        } else {
            // 1, 5,7
            int centenas = numero/100;
            int decenas = (numero%100)/10;
            int unidades = numero%10;
            int suma = (int) (Math.pow(centenas,3) + Math.pow(decenas,3)+ Math.pow(unidades,3)); // 157
                    //(centenas*centenas*centenas)+(decenas*decenas*decenas)+(unidades*unidades*unidades);
            /*
            if (suma == numero){
                System.out.println("Es armstron");
            } else {
                System.out.println("No es armstron");
            }*/

            String mensaje = suma == numero ? "Es armnstrong" : "No es armstrong";
            //System.out.println(mensaje);
            System.out.println(suma == numero ? "Es armnstrong" : "No es armstrong");
        }
    }
}
