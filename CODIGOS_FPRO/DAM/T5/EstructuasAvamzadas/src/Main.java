import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Colecciones dinamicas
        // Arraylist -> []
        ArrayList<Integer> listaCosas = new ArrayList<>();
        // el tamaño de la lista -> 0
        System.out.println("El tamaño es de " + listaCosas.size());
        listaCosas.add(5);
        listaCosas.add(15);
        listaCosas.add(25);
        System.out.println("El tamaño actualizado es de " + listaCosas.size());
        listaCosas.remove(1);
        System.out.println("El tamaño actualizado es de " + listaCosas.size());
        System.out.println("El elemento en posicion 1 es " + listaCosas.get(1));


        // tamaño es fijo -> estructuras estaticas
        /*
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[]{"programacion", "aadios", "curiosidedes", "abdios", "cariosidad", "ordenacion", "hola"};
        int[] numeros = new int[]{21, 12, 33, 14, 25, 6, 17};
        // Arrays.sort(palabras);
        // 7 palabras
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ((o1.length() > o2.length()) && o1.contains("a") ) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            }
        });
        for (String item : palabras) {
            System.out.println(item);
        }

         */
        /*System.out.println("Dime que cantidad de datos te quieres quedar");
        int cantidad = scanner.nextInt();
        numeros = Arrays.copyOf(numeros,cantidad);
        for (int item: numeros) {
            System.out.println(item);
        }*/
        // numeros[7] = 8;
        /*
        // simular eliminar uno de los elementos
        System.out.println("indica que numero quieres borrar");
        int numeroBorrar = scanner.nextInt(); // 6
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBorrar) {
                numeros[i] = -1;
                break;
            }
        }
        for (int item : numeros) {
            System.out.println(item);
        }*/

    }
}
