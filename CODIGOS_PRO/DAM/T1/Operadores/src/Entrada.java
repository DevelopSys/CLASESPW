import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {
        System.out.println("Proyecto operadores");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce el ciclo donde estas matriculado");
        String ciclo = lector.nextLine();
        System.out.println("Que nota crees que sacaras al final del curso");
        int nota = lector.nextInt();
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciclo: " + ciclo);
        System.out.println("Nota: " + nota);
        // OPERADORES -> realizar operaciones
        // aritmeticos: operaciones matematicas (depende del tipo del datos).
        // unarias ++ -- y binarias + - * / %
        int operando1 = 10;
        int operando2 = 5;
        operando1++;
        operando1++;
        operando1++; // 13
        operando2--;
        operando2--;
        operando2--; // 2
        operando2--; // 1
        int suma = operando1 + operando2; // 15
        int resta = operando1 - operando2; // 11
        int multiplicacion = operando1 * operando2; // 26
        double division = (double) operando1 / operando2; // 6.0
        int resto = operando1 % operando2; // 13%2

        System.out.println("La suma " + suma);
        System.out.println("La resta " + resta);
        System.out.println("La multipli " + multiplicacion);
        System.out.println("La division " + division);
        System.out.println("El resto  " + resto);

        operando1 = 10;
        operando2 = 7;
        System.out.println("La suma de los operandos es " + (operando1 + operando2));
        String op1 = "45"; // int
        String op2 = "15"; // int
        System.out.println("La suma de los numeros str es " +
                (Integer.parseInt(op1) + Integer.parseInt(op2)));

        // asignacion -> da un valor (numerico boolean string char)
        operando1 = 20;
        operando2 = 10;
        // operando1 = operando1+14; // 34
        operando1 += 14; // operando1 = operando1+14; 34
        operando1 -=4; // 30
        operando1 *=2; // 60
        operando1 /=10; // 6
        operando1 *= operando2; // operando1 = 6 * 10 -> 60
        // operando1 %=2; // 0

        // relacionales (siempre obtengo un boolean) > >= < <= == !=
        operando1 = 40;
        operando2 = 15;
        boolean comparacion = false; // false
        comparacion = operando1<operando2; // false
        System.out.println("El resultado de la comparacion de > es "+comparacion);
        comparacion = operando1>=10; // true
        System.out.println("El resultado de la comparacion de >= es "+comparacion);
        comparacion = operando2<operando1; // false
        System.out.println("El resultado de la comparacion de < es "+comparacion);
        comparacion = operando2<=operando1; // false
        System.out.println("El resultado de la comparacion de <= es "+comparacion);
        comparacion = operando1 == operando2; // false
        System.out.println("El resultado de la comparacion de == es "+comparacion);
        comparacion = operando1 != operando2; // true
        System.out.println("El resultado de la comparacion de != es "+comparacion);

        // logicos -> AND && (shift + 6)  OR || (alt + 1) -> (siempre obtengo un boolean)
        // sueldo mas de 40000 y edad menor de 20
        // sueldo mas de 40000 y edad mas de 20 y edad menos de 30 o pide < 20000
        operando1 = 10;
        operando2 = 20;
        boolean resultadoLogico = operando1<10 && operando2*2>30; // false
        resultadoLogico = operando1<10 || operando2*2>30; // true

    }

}
