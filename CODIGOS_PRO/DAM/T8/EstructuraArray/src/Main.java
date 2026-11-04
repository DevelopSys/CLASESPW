public class Main {

    public static void main(String[] args) {

        // conjunto de datos
        String[] clase = new String[5];
        // [null,null,null,null,null]
        String[] nombres = new String[]{"Borja", "Marcos", "Marta", "Laura","Julia", "Mateo"};

        System.out.println("El tamaño de la coleccion de nombre es de " + nombres.length);
        clase[0] = "Marta";
        clase[clase.length-1] = "Juan";
        // [Marta,null,null,null,Juan]
        /*
        System.out.println("El nombre de la primera posicion es " + nombre[0]);
        // como saco el valor de la ultima posicion
        System.out.println("El nombre de la ultima posicion es " + nombre[nombre.length-1]);
        muy utilizado para recorrer de principio a final (indicado por el programador) un array
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }
        muy utilizado para recorrer de principio a final
        for ( String element : nombres ){
            System.out.println(element);
        }
        */



        // [Borja,Marcos,Marta,Laura]
        /*
        int[] edades = new int[3];
        // [0,0,0]
        boolean[] aciertos = new boolean[4];
        // [false,false,false,false]
        */

    }
}
