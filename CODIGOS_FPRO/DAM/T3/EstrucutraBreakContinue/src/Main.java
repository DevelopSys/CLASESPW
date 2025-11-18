public class Main {
    // break -> para la repeticion en el momento donde se indica. SIEMPRE es la ultima linea del cuerpo de repeticion
    // return -> retorna un valor (el metodo). el metodo termina!!!! el return es la ultima linea del metodo
    // continue -> vas a "pasar" el turno cuando te indique
    // if -> evalua una condicion y decide si entra en un cuerpo o en otro
    // if ternario -> decide el VALOR de una variable dependiendo de una condicion logica
    public static void main(String[] args) {

        // repetitiva
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Repitiendo " + i);
            System.out.println("Terminando");
            if (i == 3) {
                break;
            }
        }*/
        /*
        do {
            acumulador += (int) (Math.random() * 41);
            if (acumulador>100 && acumulador<125){
                // pase algo logicamente
                System.out.println("Te acercas peligrosamente, terminamos el programa");
                break;
            }
        } while (acumulador <= 301);*/
        /*
        if (acumulador == 10){
            System.out.println("El valor ya lo has alcanzado");
            // break;
        }

         */
        /*

        for (int i = 0; i < 10; i++) {
            System.out.println("La tabla del " + i);

            for (int j = 0; j < 11; j++) {
                System.out.printf("\tEl resultado de %d * %d = %d%n", i, j, i * j);
                if (i == 1) {
                    break;
                }
            }

        }
         */
        /*
         */
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Imprimiento dato en posicion "+i);
            return;
        }*/
        /*
        while (acumulador<301){
            System.out.println("Acumulador insuficiente");
            return;
        }*/
        /*
        int acumulador = 1000;
        do {
            acumulador += (int) (Math.random() * 41);
            if (acumulador > 100 && acumulador < 110) {
                return;
            }
        } while (acumulador <= 301);
*/
        /*
        int acumulador = 1000;
        System.out.println("El acumulador tiene un valor de " + acumulador);
        System.out.println("Terminando el programa");
        int[] numeros = {1, 4, 34, -12, 56, 12, -56, 78, 12, -56}; // length: 10 primera pos: 0 ultima: 9
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0) {
                continue;
            }

            System.out.println(numeros[i]);

        }*/

        /*if (nota>=5){
            System.out.println("Examen aprobado");
        } else {
            System.out.println("Examen suspenso");
        }*/
        // variable = condicion logica ? "val de la variable cuando es true" : "val de la variable cuando es false"
        int nota = 7;
        String resultado = nota<5 ? "suspenso" : "aprobado";
        char letraNota = nota>=5? 'A' : 'F';
        System.out.println(resultado);
    }
}
