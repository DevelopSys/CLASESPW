package ejercicioMayorMenor;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[]{15, 8, 23, 4, 19, 12};
        String[] palabras = {"palabra","adios","programacion","cosa","orden","hola"};
        //                      0          1        2           3       4       5
        //                      6
        /*int max = numeros[0], min = numeros[0];
        // 23 4
        for (int item : numeros) {
            if (item > max){
                max = item;
            }
            if (item<min){
                min = item;
            }
        }*/
        String maxPal = palabras[0], minPal = palabras[0];
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 1
                if (o1.length()>o2.length()){
                    return 1;
                } else if (o1.length()<o2.length()) {
                    return -1;
                }
                // -1
                return 0;
            }
        });

        // 23 4
        /*for (String item : palabras) {
            if (item.length() > maxPal.length()){
                maxPal = item;
            }
            if (item.length()<minPal.length()){
                minPal = item;
            }
        }*/
        // hace la ordenacion numeraricamente
        // Arrays.sort(numeros);
        // hace la ordenacion alfabeticamente


        //         int min = numeros[0], max = numeros[numeros.length-1];

        System.out.println("max = " + palabras[0]);
        System.out.println("min = " + palabras[palabras.length-1]);
    }
}
