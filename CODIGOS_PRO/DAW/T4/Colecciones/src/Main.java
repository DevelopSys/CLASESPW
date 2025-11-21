import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 2;
        // defino el array segun el numero de elementos
        boolean[] aciertos = new boolean[4];
        // [false,false,false,false]
        String[] palabras = new String[3];
        // [null,null,null]
        Object[] cosas = new Object[5];
        // [null,null,null,null,null]
        int[] numerosConcretos = new int[]{5, 3, 1, 10, 8, 23, 12, 32};
        Integer[] numerosConcretos2 = new Integer[]{1, 3, 4, 5, 6, 7, 8};
        boolean[] aciertosConcretos = new boolean[]{false, true, true};
        String[] palabrasConcretas = new String[]{"hola", "programacion", "array"};
        Object[] cosasConcretas = new Object[]{1, "adios", false, 6,0.0,"hola", 'a'};
        for ( Object item : cosasConcretas){
            if (item instanceof Integer){
                if ((int)item>0){
                    System.out.println("El numero es mas grande que 0");
                }
            } else if (item instanceof String) {
                System.out.println("La longitud de la palabra es "+item.toString().length());
            }
        }
        /*
        for (int i = 0; i < cosasConcretas.length; i++) {
            System.out.println("El elemento es "+cosasConcretas[i]);
        }

         */

        /*
        // acciones que puedo realizar con los arrays
        System.out.println("Cuantos numeros vas a querer guardar");
        int tamanio = scanner.nextInt();
        int[] numeros = new int[tamanio];
        // [23,12,11,45,6,41]
        // guardar numeros aleatorios entre el 1 y el 50
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1; //1-50
        }
        System.out.println("Que numero quieres buscar");
        int numeroBuscar = scanner.nextInt(); // 23
        int contador=0;
        // boolean encontrado = false;
        int posicion = -1;
        // pedir al usuario el numero buscado
        // el sistema deberá decirme el que posicion está el primer 23 encontrado. En caso de no tener 23 me avisa
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscar){
                posicion = i;
                break;
            }
        }

        if (posicion==-1){
            System.out.println("El numero no se encuentra en la coleccion");
        } else {
            System.out.println("La posicion encontrada es "+posicion);
        }
        for (int item : numeros) {
            System.out.println(item);
        }

        /*
        for (int item : numeros) {
            if (item == numeroBuscar) {
                contador++;
            }
        }
        System.out.println("El numero de veces que esta el numero buscado es "+contador);
        */
        /*
        for (int item : numeros) {
            System.out.println(item);
        }

        // [19,0,0,0,0,30]
        //  0 1 2 3 4 5  -> posiciones length -> 6-1
        // saber la longitud del array -> cuantos elementos hay en el array
        int longi = numeros.length;
        System.out.println("El numero de elementos del array es "+longi);
        // modificar elementos
        numeros[0] = 19;
        numeros[numeros.length-1] = 30;
        // acceder a uno de los elementos
        System.out.println("El elemento de la primera posicion es "+numeros[0]);
        System.out.println("El elemento de la posicion central es "+numeros[numeros.length/2]);
        System.out.println("El elemento de la ultima posicion es "+numeros[numeros.length-1]);
        // mostrar todos los elementos del array


        //Utilizado para poder recorrer un array desde una posicion inicial hasta una final
        //Utilizado para modificar el valor de las posiciones

        for (int i=2;i<numeros.length;i++){
            //if (numeros[i]%2!=0){
                System.out.printf("El elemento en posicion %d es %d%n",i,numeros[i]);
            //}
        }
        // [19,0,0,0,0,30]
        // Utilizado para recorrer el valor de las posiciones
        int contador = 0;
        for ( int item : numeros ){
            System.out.println("El elemento en iteracion es "+item+" en posicion "+contador);
            contador++;
        }*/


    }
}
