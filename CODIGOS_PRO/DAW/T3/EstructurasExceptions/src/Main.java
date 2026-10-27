import java.io.File;
import java.io.FileFilter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de excepciones");
        String nombre = "Borja";
        int resultado = 0;
        int op1 = 0, op2 = 0;
        /*try {
            System.out.println(nombre.toUpperCase());
            System.out.println("La variable ha salido sin problemas");
            System.out.println("Indica un numero 1");
            op1 = scanner.nextInt();
            System.out.println("Indica un numero 2");
            op2 = scanner.nextInt();
            resultado = op1 / op2;
            System.out.println("El resultado de la division es ");
            // hay posibles fallos
        } catch (NullPointerException exception) {
            System.out.println("El acceso a la variable es nulo, no se puede");
        } catch (ArithmeticException exception) {
            System.out.println("Error de op2 con valor 0");
            System.out.println("Indica un valor para op2 diferente");
            op2 = scanner.nextInt();
            resultado = op1 / op2;
        } catch (Exception e) {
            System.out.println("Fallo general");
        } finally {
            System.out.println("Ejecuto esta parte tanto si se falla como si no");
            // se utiliza para cerrar recursos
            System.out.println("El resultado de la operacion es " + resultado);
        }*/
        boolean fallo = false;

        do {
            scanner = new Scanner(System.in);
            try {
                System.out.println("Indica un numero 1");
                op1 = scanner.nextInt();
                fallo = false;
                do {
                    try {
                        System.out.println("Indica un numero 2");
                        op2 = scanner.nextInt();
                        resultado = op1 / op2;
                        fallo = false;
                        System.out.println("El resultado de la division es " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Op2 invalido");
                        fallo = true;
                    }
                } while (fallo);
            } catch (InputMismatchException e) {
                fallo = true;
            }
        }while (fallo);

    }
}
