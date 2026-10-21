package ejerciciosSwitch;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Indica el segundo operando");
        int operando2 = lector.nextInt();
        System.out.println("Indica el tipo de operacion");
        String operacion = lector.next();
        double resultado = 0;
        switch (operacion) {
            case "+" -> {
                resultado = operando1 + operando2;
            }
            case "-" -> {
                resultado = operando1 - operando2;
            }
            case "*" -> {
                resultado = operando1 * operando2;
            }
            case "/" -> {
                if (operando2 != 0) {
                    resultado = (double) operando1 / operando2;
                }
            }
        }
        System.out.printf("El resultado de la operacion de %s entre %d y %d es %.2f", operacion, operando1, operando2, resultado);
    }
}
