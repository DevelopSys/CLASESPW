import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainRecursivo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op1=0, op2=0;
        boolean fallo ;
        do{
            try {
                System.out.println("Introduce el numero 1");
                op1 = scanner.nextInt();
                System.out.println("Introduce el numero 2");
                op2 = scanner.nextInt();
                System.out.println("Pasamos a calcular los resultados");
                int suma = op2 + op1;
                int resta = op2 - op1;
                int multi = op2 * op1;
                int div = op1 / op2;
                // System.out.println(numeros[70]);
                System.out.println("Los resultados son");
                System.out.println("La suma es: " + suma);
                System.out.println("La resta es: " + resta);
                System.out.println("La multi es: " + multi);
                System.out.println("La division es: "+div);
                fallo = false;
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.out.println("Fallo generico");
                System.out.println(e.getMessage());
                fallo = true;
            }
        }while (fallo);


        System.out.println("Terminando la calculadora");

    }
}
