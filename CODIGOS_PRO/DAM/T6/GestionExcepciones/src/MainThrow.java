import model.Operaciones;
import util.ResultadoExcepcion;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrow {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int op1 = 0, op2 = 0;
        boolean fallo = false;
        do {
            try {
                System.out.println("Introduce el numero 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el numero 2");
                op2 = scanner.nextInt();
                System.out.println("Pasamos a calcular los resultados");
                int suma = operaciones.operarSuma(op1, op2);
                int resta = operaciones.operarResta(op1, op2);
                int multi = operaciones.operarMulti(op1, op2);
                int div = operaciones.operarDiv(op1, op2);
                // System.out.println(numeros[70]);
                System.out.println("Los resultados son");
                System.out.println("La suma es: " + suma);
                System.out.println("La resta es: " + resta);
                System.out.println("La multi es: " + multi);
                System.out.println("La division es: " + div);
                System.out.println("Terminando la calculadora");
                int[] numeros = {1, 2, 3, 4};
                System.out.println(numeros[8]);
                fallo = false;
            } catch (ArithmeticException | InputMismatchException e) {
                scanner = new Scanner(System.in);
                System.out.println("Error en division");
                fallo = true;
            } catch (ResultadoExcepcion e) {
                System.out.println(e.getMessage());
                int tempo = op1;
                op1 = op2;
                op2 = tempo;
                System.out.println("La resta es: " + (op1 - op2));
            } catch (Exception e) {
                System.out.println("Generico");
                fallo = false;
            }
        } while (fallo);
    }
}
