import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array
        // mediante numero de "huecos"
        // mediante elementos
        // [0,0,0,0,0]
        System.out.println("Cuantos numeros quieres guardar");
        // int tamanioNumeros = scanner.nextInt();
        int[] listaNumeros = new int[8];
        // [false,false,false]
        boolean[] listaAciertos = new boolean[3];
        // [0.0,0.0,0.0,0.0,0.0,0.0]
        double[] listaNotas = new double[6];
        // [null,null,null,null]
        String[] listaNombres = new String[4];
        // [78,23,45,72,24.65]
        int[] listaNumerosIntroducidos = new int[]{54, 23, 45, 72};

        // Saber cual es el tamaño del array -> cuantos elementos hay en el array
        System.out.println("El tamaño del array es " + listaNumeros.length);
        // [0,0,0,0,0,0,0,0]
        // Modificar uno de los elementos del array
        listaNumeros[listaNumeros.length - 1] = 34;
        listaNumeros[0] = 64;
        listaNumeros[listaNumeros.length / 2] = 56;
        // [64,0,0,0,56,0,0,34]
        // Obtener uno de los elementos del array
        System.out.println("Accediento a posiciones");
        System.out.println("La posicion 0 es el valor: " + listaNumeros[0]);
        System.out.println("La posicion 4 es el valor: " + listaNumeros[listaNumeros.length / 2]);
        System.out.println("La posicion 7 es el valor: " + listaNumeros[listaNumeros.length - 1]);
        System.out.println("La posicion 1 es el valor: " + listaNumeros[1]);

        // rellenar los elementos con aleatorios

        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = (int) (Math.random() * 50);
        }
        // obtener todos los elementos -> for
        System.out.println("Imprimiendo los elementos del array");
        // System.out.println(listaNumeros);
        int sumatorio = 0;
        /*for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
            sumatorio += listaNumeros[i];
        }*/
        for (int item : listaNumeros) {
            System.out.println("Ejecutando valor " + item);
            sumatorio += item;
        }

        // el sumatorio de todos los numeros del array
        System.out.println("El sumatorio de los numeros es " + sumatorio);

        //[ 3,4,12,43,6,76,32]
        // eliminar un elemento del array

        System.out.println("Imprimiendo palabras");
        // String[] palabras = new String[]{"Hola", "Adios", "Juego", "Programacion", "clase", "Java"};
        String[] palabras = new String[]{null,null,"hola",null,"adios"};
        // null null null null null
        /*
        for (String item : palabras) {
            System.out.println(item);
        }*/
        // System.out.println("La palabra aleatoria es: "+palabras[(int) (Math.random()*palabras.length)]);
        // quiero saber si la palabra hola este en el array
        for (String item:palabras) {
            if(item!=null && item.equals("hola")){
                System.out.println("Encontrado");
            }
        }
    }
}
