package ejercicio4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
que un mismo equipo no puede jugar más de un partido
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bombo1 = new String[5];
        String[] bombo2 = new String[5];
        for (int i = 0; i < 2; i++) {
            System.out.println("Equipos del bombo " + i + 1);
            for (int j = 0; j < bombo1.length; j++) {
                System.out.println("Indica la seleccion");
                String seleccion = scanner.next();
                if (i == 0) {
                    bombo1[j] = seleccion;
                } else {
                    bombo2[j] = seleccion;
                }
            }
        }
        System.out.println("Imprimiendo bombo 1");
        imprimiendoBombo(bombo1);
        System.out.println("Imprimiendo bombo 2");
        imprimiendoBombo(bombo2);


    }

    public static void imprimiendoBombo(String[] bombo){
        for (String item : bombo) {
            System.out.println(item);
        }
    }
}
