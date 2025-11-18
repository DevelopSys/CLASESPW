public class Main {

    // break -> rompe una iteracion
    // return -> retorna un valor en el metodo y lo termina. Es la ultima linea del metodo
    // continue -> la iteracion que tenga el continue no la ejecuta, pero no rompe la ejecicion
    // if -> condicional que permite ejecutando un cuerpo u otro
    // if terminario -> decida el valor de una variable sobre una condicion logica
    public static void main(String[] args) {

        int acumulador = 0, intentos = 0;
        int[] numeros = {1, 4, -67, 23, -12, 24, 68, -96};

        /*
        for (int i = 0; i <10; i++) {
            acumulador += (int) (Math.random()*101);
            intentos++;
            if (acumulador>=301){
                break;
            }
            System.out.println("Continuamos incrementando la variable, saldo insuficiente");
        }
        */
        /*
        do{
            System.out.println("Repitiendo");
            acumulador += (int) (Math.random()*20);
            intentos++;
            if(acumulador>100 && acumulador<110){
                break;
            }
        }while (acumulador<301);
        System.out.println("Terminando la ejecucion con un saldo de "+acumulador);
        System.out.println("Has necesitado de "+intentos);

         */
        /*
        if (acumulador==10){
            System.out.println("Acumulador valor 10");
        } else if (acumulador==20) {
            System.out.println("Acumulador valor 20");
        }

         */
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando en la vuelta "+i);
            if (i==4){
                return;
            } else if (i==5) {
                return;
            }
            // return;
            // no se ejecuta
        }*/
        /*
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("Numero negativo");
                continue;
            }
            // solo va a ser ejecutable si el numero es >=0
            System.out.println(numeros[i]);
        }*/

        int nota = 5;
        //variable =  condicion ? el valor de la variable si la condicion es true : el valor de la variable si la condicion es false
        String resultado = nota>=5 ? "Examen aprobado" : "Examen suspenso" ;
        boolean notaBool = nota>5 ? true : false;
        System.out.println(resultado);
        // System.out.println(nota>=5 ? "Examen aprobado" : "Examen suspenso" );

    }
}
