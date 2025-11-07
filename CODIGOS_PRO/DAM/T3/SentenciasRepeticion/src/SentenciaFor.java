public class SentenciaFor {
    public void sentenciaFor() {
        // inicial;final;incrementa
        // [0,4]
        // i=0 OK
        // i=1
        // i=2 OK
        // i=3
        // i=4 OK
        // i=5
        // i=6
        /*
        for (int i = 0; i < 100; i++) {
            try {
                System.out.printf("%d",i);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
         */
        for (int i = 100; i >= 0; i--) {
            if (i % 7 == 0) {
                System.out.println("Ejecuciones " + i);
            }
        }
    }

    public void tablaMultiplicarNumero(int numero) {
        // 6
        // 6*0
        // 6*1
        // 6*2
        System.out.println("Procedemos a escribir la tabla de multiplicar del " + numero);
        // [0,10]
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);
        }
    }

    public void todasTablas() {
        // 1-10
        for (int i = 1; i < 11; i++) {
            System.out.println("Sacando la tabla del " + i);
            // 1 2 3 4 5 6 7 8 9 10 11
            for (int j = 0; j < 11; j++) {
                // 0 1 2 3 4 5 6 7 8 9 10
                System.out.printf("\t%d * %d = %d%n", j, i, i * j);
            }
        }
    }

    public void dibujarCuadrado() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else if (j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // cada una de las letras de una palabra
    public void palabraPalidromo() {
        // palabra es palindromo cuando se lee igual de principio a fin que de fin a principio
        // alli ves sevilla
        // tiene que haber un boolean en algun sitio
        // ANNNNA
        String frase = "alli ves sevilla";
        frase = frase.replaceAll(" ","");
        boolean esPalindromo = true;
        for (int i = 0; i < frase.length() / 2; i++) {
            // comparar cada letra 0->ultimo
            // comparar cada letra 1->penultimo
            // comparar cada letra 2->antepenultimo
            // i=2
            // letraUno = l
            // letraDos =

            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length() - 1 - i);
            if (letraUno != letraDos) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

    }

    // calcular el factorial de un numero
    public void calcularFactorial(){
        // 5! = 5*4*3*2*1
        // 7! = 7*6*5*4*3*2*1
        // 4!
        /*

        1*1 =1
        1*2 =2
        2*3= 6
        6*4= 24

         */
        int numeroCalcular=4;
        int factorial = 1;
        for (int i = 1; i <= numeroCalcular; i++) {
            factorial = factorial* i;
        }
        System.out.printf("El factorial de %d es %d",numeroCalcular,factorial);


    }

    public void recorrerColeccion(){
        int[] numeros = {1,10,90,40,98,76,53};
        // un armario de n posiciones 1,10,90,40
        // [0,3]
        // [3,0]
        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/
        for ( int item : numeros ){
            System.out.println(item);
        }
    }
}
