package ejercicio1;

import java.util.Scanner;

public class Main {

    /*
    Crea un programa de adivinación de números El programa genera de manera
    aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
    máximo de 7 intentos. Después de cada intento, indica si el número es mayor
    o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
    de intentos utilizado; si no, mostrar un aviso de que debe introducir
    nuevamente un número.
    0- Necesito pedir cosas por teclado OK
    1- Generar un aleatorio entre 1-50 OK
    2- 7 intentos / repeticiones mientras no se acierta
        3- indicar si el numero es mayor o menos del elegido
    4 - Mostrar un aviso con el numero de intentos utilizado
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSistema = (int) (Math.random() * 50) + 1; // 0.0-49.999999 -> 1 - 50
        System.out.println("El numero del sistema es el " + numeroSistema);
        int intentos = 5;
        int numeroUsuario;
        boolean acierto = false;
        do {
            System.out.println("Indica el numero con el que juegas");
            numeroUsuario = scanner.nextInt();
            intentos--;
            if (numeroSistema == numeroUsuario) {
                System.out.println("Has acertado el numero");
                acierto =true;
                break;
            }
            else{
                if(numeroSistema<numeroUsuario){
                    System.out.println("Numero demasiado grande");
                }
                else {
                    System.out.println("Numero demasiado pequeño");
                }
            }
            // vas a pedir numero 7max min1
            System.out.println("Has consumido "+(5-intentos));
        } while (intentos > 0);

        // has perdido
        if (!acierto) {
            System.out.println("Has perdido");
        }

    }
}
