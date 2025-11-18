package ejercicioPalabras;

import java.util.Scanner;

public class Main {

    /*
    Pedir por consola una frase. Una vez introducida. Indicar:
        1. Cuantas oraciones tiene -> separadas por un .
        2. Cuantas letras tiene
        3. Cuantas palabras tiene
        4. Cuantas letras tiene (sin contar espacios ni símbolos de puntuación)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar");
        String frase = scanner.nextLine();
        System.out.println(frase);
        // "[Esta frase es la la que analizo Esta es otra frase]"
        // String[] = [Esto es solo una frase,Esta es la segunda]
        // System.out.println("La frase es "+frase);
        String[] frases = frase.split("\\.");
        String frasePalabras = frase.replaceAll(",", "")
                .replaceAll(" ", "")
                .replaceAll("\\.", "");
        String palabraFrase = frase.replaceAll(",", " ").replaceAll("\\.", " ");
        String[] palabras = palabraFrase.split(" ");
        System.out.println("El resultado es " + frasePalabras);
        System.out.println("El numero de oraciones es " + frases.length);
        System.out.println("El numero de letras es " + frasePalabras.length());
        System.out.println("El numero de palabras es " + palabras.length);
        for (String item : frases) {
            int contador = item.split(" ").length;
            System.out.println("El numero de palabras de la oracion es "+contador);
        }
    }
}
