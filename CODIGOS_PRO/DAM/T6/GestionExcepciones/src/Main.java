import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1,23,4,5,5,6,7};
        int div =0;
        int op1=0, op2=0;
        try {
            System.out.println("Introduce el numero 1");
            op1 = scanner.nextInt();
            System.out.println("Introduce el numero 2");
            op2 = scanner.nextInt();
            System.out.println("Pasamos a calcular los resultados");
            int suma = op2 + op1;
            int resta = op2 - op1;
            int multi = op2 * op1;
            div = op1 / op2;
            // System.out.println(numeros[70]);
            System.out.println("Los resultados son");
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multi es: " + multi);

        } catch (InputMismatchException e) {
            System.out.println("Error en la introduccion de datos por teclado");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Calculo erroneo en la division");
            System.out.println("Introduce un operando diferente a 0 para dividir");
            op2 = scanner.nextInt();
            div = op1 / op2;
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Fallo generico");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("La division es: " + div);
        }

        System.out.println("Terminando la calculadora");

    }
}
