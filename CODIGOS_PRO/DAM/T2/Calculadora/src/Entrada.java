import model.Calculadora;

import javax.swing.*;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // ModelViewControl
        Calculadora calculadora = new Calculadora();
        // op1 = 7, op2= 3, resultado = 1.0, tipo = null
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt(); // 7
        lector.close();        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt(); // 3

        calculadora.sumar(operando1,operando2);
        // System.out.println("El resultado es "+calculadora.getResultado()); // 1.0
        calculadora.resta(operando1,operando2);
        // System.out.println("El resultado es "+calculadora.getResultado()); // 1.0
        calculadora.division(operando1,operando2);
        // System.out.println("El resultado es "+calculadora.getResultado()); // 1.0
        calculadora.multiplicacion(operando1,operando2);
        // System.out.println("El resultado es "+calculadora.getResultado()); // 1.0
        calculadora.modulo(operando1,operando2);
        // imprimir el resultado
        System.out.println("La ultima operacion realizada es "+ calculadora.getTipo());
        System.out.println("El resultado es "+calculadora.getResultado()); // 1.0
        System.out.println("La ultima operacion es de "+calculadora.getTipo());
    }
}
