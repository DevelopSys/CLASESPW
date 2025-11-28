import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<String> listaPalabras = new ArrayList<>();
        // [1,2,123,123,123,123,123,123,123,123,123,123,123,123,123]
        // añadir un elemento
        /*for (int i = 0; i < 20; i++) {
            listaNumeros.add((int) (Math.random()*21)); // -> se guarda en la posicion 0
        }*/
        listaPalabras.add("Hola");
        listaPalabras.add("Adios");
        listaPalabras.add("Programacion");

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        // [1,2,3,4]
        listaNumeros.remove(1);
        // listaPalabras.remove("Hola");
        // Para obtener el valor de un dato get
        int numero = listaNumeros.get(1);
        // para poder obtener todos los datos
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
        System.out.println("El numero obtenido es: "+numero);
        System.out.println("El tamaño de esta coleccion es de " + listaNumeros.size());

        /*
        String palabra1 = "Palabra1";
        String palabra2 = "Palabra2";
        String palabra3 = "Palabra3";
        String palabra4 = "Palabra4";
        String palabra5 = "Palabra5";
        String palabra6 = "Palabra6";

        String[] palabras1 = new String[]{palabra1,palabra2,palabra3, palabra4};
        String[] palabras2 = new String[]{palabra5, palabra6, palabra1,palabra2};
        // simular que una de las posiciones del array se elimina
        System.out.println("Indica que palabra quieres eliminar");
        String palabraEliminar = scanner.next();
        boolean hueco = false;
        for (int i = 0; i < palabras1.length; i++) {
            if (palabras1[i].equals(palabraEliminar)){
                palabras1[i] = null;
                hueco = true;
                break;
            }
        }

        if (hueco){
            System.out.println("Indica que palabra quieres guardar dentro del array");
            String palabraGuardar = scanner.next();
            for (int i = 0; i < palabras1.length; i++) {
                if (palabras1[i]==null){
                    palabras1[i] = palabraGuardar;
                }
            }

        }

        for (String item: palabras1) {
            System.out.println(item);
        }



        System.out.println("Vamos a recorrer cada una de las palabras del primer array");
        for (String item: palabras1) {
            System.out.println(item);
        }
        System.out.println("Vamos a recorrer cada una de las palabras del segundo array");
        for (String item: palabras2) {
            System.out.println(item);
        }
        palabras1[1] = "Palabra cambiada";
        // palabras 1 ["palabra1", "palabra2", "palabra3","palabra4"]
        // palabras 1 ["palabra1", "palabra cambiada", "palabra3","palabra4"]
        System.out.println("Vamos a recorrer de nuevo cada una de las palabras del primer array");
        for (String item: palabras1) {
            System.out.println(item);
        }
        System.out.println("Vamos a recorrer de nuevo cada una de las palabras del segundo array");
        for (String item: palabras2) {
            System.out.println(item);
        }*/
    }
}
