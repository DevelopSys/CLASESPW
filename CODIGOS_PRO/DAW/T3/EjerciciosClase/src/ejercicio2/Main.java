package ejercicio2;

import java.util.Scanner;

public class Main {

    /*
    a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
    b. El programa debe seleccionar aleatoriamente una palabra del array y
        almacenarla como la palabra secreta.
    c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
    d. En cada intento, el usuario introduce una palabra por teclado.
    e. Tras cada intento, el programa debe indicar al usuario:
        i. Aciertos: cuántas letras tiene en la misma posición que la palabra
        secreta.
        ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
        posición diferente.
        iii. Fallos: cuantas letras no están presentes en la palabra secreta.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = {"datos", "cosas", "lucia", "manta"};
        String palabraSecreta = palabras[(int) (Math.random() * 4)];
        String palabraUsuario;
        System.out.println("La palabra a adivinar es " + palabraSecreta);
        int intentos = 5;
        // aciertos: 2
        // aprox: 1
        // fallos: 2
        do {
            do {
                System.out.println("Introduce la palabra");
                palabraUsuario = scanner.next();
                if (palabraUsuario.length() != 5) {
                    System.out.println("Palabra invalida");
                }
            } while (palabraUsuario.length() != 5);
            System.out.println("Intento gastado");
            intentos--;
            int numeroAciertos = 0, numeroAprox = 0, numeroErrores = 0;
            // analizar
            if (palabraUsuario.equals(palabraSecreta)) {
                System.out.println("Palabra adivinada");
                numeroAciertos = 5;
                break;
            }
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // i=0, 1, 2, 3, 4
                // cosas
                // dosas
                if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) {
                    numeroAciertos++;
                } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                    numeroAprox++;
                } else {
                    numeroErrores++;
                }
            }
            System.out.println("El numero de aciertos es "+numeroAciertos);
            System.out.println("El numero de errores es "+numeroErrores);
            System.out.println("El numero de aproximaciones es "+numeroAprox);
        } while (intentos > 0);

        System.out.println("Saliendo del juego....");
    }
}
