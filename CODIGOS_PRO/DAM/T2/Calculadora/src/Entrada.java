import model.Calculadora;

import javax.swing.*;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // ModelViewControl
        Calculadora calculadora = new Calculadora();
        // op1 = 0, op2= 0, resultado = 0, tipo = null
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce el segundo operando");
        int operando2 = lector.nextInt();
        lector.close();
        calculadora.sumar(operando1,operando2);
        // imprimir el resultado
        System.out.println("El resultado es "+calculadora.getResultado());
        System.out.println("La ultima operacion es de "+calculadora.getTipo());
    }
}
