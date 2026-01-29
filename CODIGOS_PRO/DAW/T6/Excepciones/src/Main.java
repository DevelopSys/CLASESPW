import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // int numeros[] = new int[]{1, 2, 3, 4, 5, 6};
        // NullPointerException - ArrayIndexOutofBoundException- ArithException - InputMisMatchException
        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        // vamos a realizar una suma, una multiplicacion, una
        boolean fallo = false;
        System.out.println("Vamos a realizar opreaciones");
        try{
            System.out.println("Indicame el operando uno");
            int operando1 = scanner.nextInt();
            System.out.println("Indicame el operando uno");
            int operando2 = scanner.nextInt();
            operaciones.sumar(operando1,operando2); // va con la etiqueta que puede provocar error Arth
        } catch (InputMismatchException e){
            System.out.println("error en la introduccion de los datos");
        } catch (ArithmeticException e){
            System.out.println("Division entre cero, le pongo solucion");
        }
        /*do {
            try {
                System.out.println("Indicame el operando uno");
                int operando1 = scanner.nextInt();
                System.out.println("Indicame el operando uno");
                int operando2 = scanner.nextInt();
                int suma = operando2 + operando1;
                int multiplicacion = operando2 * operando1;
                int division = operando1 / operando2;
                // ArrayIndexOutOfBoudnExcepcion - FileNotFoundException - SQLException
                fallo = false;
                System.out.println("Los resultado son");
                System.out.println("Suma " + suma);
                System.out.println("Multiplicacion " + multiplicacion);
                System.out.println("Division " + division);
            }
            catch (InputMismatchException | ArithmeticException  e) {
                System.out.println("Error en el proceso de calculo");
                System.out.println("Quieres iniciar el proceso nuevamente s/n");
                scanner = new Scanner(System.in);
                String contestacion = scanner.next();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            }
            catch (ArithmeticException e) {
                System.out.println("El usuario ha intentado dividir entre 0");
                System.out.println("Quieres iniciar el proceso nuevamente s/n");
                scanner = new Scanner(System.in);
                String contestacion = scanner.next();
                if (contestacion.equals("s")) {
                    fallo = true;
                }
            }
            catch (Exception e) {
                System.out.println("Fallo general");
            }
            finally {
                // se ejecuta si o si, tanto si hay error como si no lo hay
            }





        } while (fallo);*/


        System.out.println("Finalizando el proceso de calculo");


    }
}
