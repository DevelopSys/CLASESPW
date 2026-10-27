package ejericiosClase;

import java.util.Scanner;

public class Ejercicio7If {

    /*
    Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número.
    Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong.
    Se comprobará previamente que el número introducido tiene 3 dígitos.
    En la salida se mostrará uno de los siguientes mensajes:
        1. “El número no tiene 3 dígitos”
        2. “Es un número Armstrong”
        3. “No es un número Armstrong”.

     */

    public static void main() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el numero a comprobar");
        int numero = lector.nextInt();

        // es de 3 cifras?
        // if (String.valueOf(numero).length() == 3)
        if (numero > 99 && numero < 1000) {
            // 15
            int centenas = numero / 100;
            int decenas = (numero / 10) % 10;
            int unidades = numero % 10;
            int suma = (int)(Math.pow(centenas,3)+Math.pow(decenas,3)+Math.pow(unidades,3)); // 1^3+5^3+3^3
            /*if(suma == numero){
                System.out.println("Es armstrong");
            } else {
                System.out.println("No es armstrong");
            }*/
            // String mensaje = suma == numero ? "Es armstrong" : "No es armstrong";
            // System.out.println(mensaje);
            System.out.println(suma == numero ? "Es armstrong" : "No es armstrong");

        } else {
            System.out.println("El número no tiene 3 dígitos");
        }


    }
}
