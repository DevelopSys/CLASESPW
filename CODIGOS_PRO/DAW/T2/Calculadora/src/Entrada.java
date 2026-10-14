import controller.Calculadora;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // View -> lo que interacciona con el usuario
        Calculadora calculadora = new Calculadora();
        // op1 = 7, op2 = 3, resultado = 1.0
        Scanner lector = new Scanner(System.in);
        System.out.println("Operando 1"); // 7
        int operando1 = lector.nextInt();
        System.out.println("Operando 2");
        int operando2 = lector.nextInt(); // 3
        calculadora.sumar(operando1,operando2);
        calculadora.restar(operando1,operando2);
        calculadora.dividir(operando1,operando2);
        calculadora.multiplicacion(operando1,operando2);
        calculadora.modulo(operando1,operando2);
        System.out.println("El resultado final es "+calculadora.getResultado()); // 1

    }
}
