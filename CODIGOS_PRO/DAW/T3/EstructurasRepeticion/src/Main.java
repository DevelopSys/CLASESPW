import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // inicial ; final ; incremento
        // [0,5]
        // pide por teclado 10 numeros y di de todos ellos cuantos
        // son pares
        // son impares
        // el numero medio introducido
        Scanner scanner = new Scanner(System.in);
        /*
        int contadorPares=0, contadorImpares = 0;
        int sumatorio=0;
        // calcular cual es el mas grande cual es el mas pequeño
        for(int i=0; i<5;i++){
            System.out.println("Introduce un numero en posicion "+i);
            int numero = scanner.nextInt();
            if (numero%2==0){
                contadorPares++;
            } else {
                contadorImpares++;
            }
            sumatorio +=numero;
            if (numero==8){
                break;
            }
        }
        System.out.println("Saliendo del for");
        System.out.println("El numero de pares es "+contadorPares);
        System.out.println("El numero de impares es "+contadorImpares);
        System.out.println("El numero medio introducido es "+sumatorio/5);

         */
        /*

        for (int i = 10; i>=0; i-=4) {
            System.out.println("Ejecucion de linea repetida "+i);
        }
         */
        // Sacar todas las tablas de multiplicar del 0 al 10
        /*for (int i = 0; i < 11; i++) {
            // System.out.println(5+" * "+i+" = "+i*5);
            System.out.printf("%d * %d = %d%n", 5, i, 5 * i);
            // %s -> palabras
            // %.2f -> numeros con dos decimales
            // %d -> numero sin decimales
            // %n -> salto de linea
        }*/
        System.out.println("Indica el tamaño del cuadrado");
        int tamanio = scanner.nextInt();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == tamanio - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // factorial de un numero
        /*
        4! = 4*3*2*1
        1*1 = 1
        1*2 = 2
        2*3 = 6
        6*4 = 24
        */
        long factorial = 1;
        for (int i = 1; i <= 28; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de numero es " + factorial);

        // si una palabra es palindromo
        // si se puede leer igual de izq a der que de der a izq
        // ana oso allivessevilla
        System.out.println("Indica la palabra para ver si cumplo");
        scanner = new Scanner(System.in);
        // String palabra = scanner.nextLine();
        String palabra = "oso";
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            // System.out.println(palabra.charAt(i));
            // i=0 -> a != a
            // i=1 -> l != l
            // i=2 -> l != l
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

        double numero = 2.45;
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        /*
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println(diasSemana[i]);
            }
        }
         */
        // inicio; final; incremento
        //    :  coleccionARecorrer
        for ( String item : diasSemana ){
            System.out.println(item);
        }
    }
}
